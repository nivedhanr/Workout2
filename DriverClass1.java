import java.util.Scanner;

class Faculty{
    int id,salary;
}
class FullTimeFaculty extends Faculty{
   void input(){
       System.out.println("Enter id:");
       Scanner s= new Scanner(System.in);
       id=s.nextInt();
       System.out.println("Enter basic:");
       int basic=s.nextInt();
       System.out.println("Enter allowance:");
       int allowance=s.nextInt();
       int salary=basic+allowance;
       System.out.println("id:"+id);
       System.out.println("Salary:"+salary);

   }
}
class PartTimeFaculty extends Faculty{
    void input(){
        System.out.println("Enter id:");
        Scanner s= new Scanner(System.in);
        id=s.nextInt();
        System.out.println("Enter the working hour:");
        int hour=s.nextInt();
        System.out.println("Enter the salary per hour:");
        int salaryperhour=s.nextInt();
        int parttimesalary =hour*salaryperhour;
        System.out.println("id:"+id);
        System.out.println("Part time salary:"+parttimesalary);

    }
}
public class DriverClass1 {
    public static void main(String[] arg){
        FullTimeFaculty ob1=new FullTimeFaculty();
        FullTimeFaculty ob2=new FullTimeFaculty();
        PartTimeFaculty ob3=new PartTimeFaculty();
        PartTimeFaculty ob4=new PartTimeFaculty();
        ob1.input();
        ob2.input();
        ob3.input();
        ob4.input();
    }
}
