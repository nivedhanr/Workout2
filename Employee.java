import java.util.Scanner;

class Employee1 {
    String result;
    void find(int ass1,int ass2,int ass3){
            if(ass1>75 && ass2>75 && ass3>75){
                result="PROMOTED";
                System.out.println(result);
            }
            else {
                result="DEMOTED";
                System.out.println(result);
            }
            int total=ass1+ass2+ass3;
            float avg= total/3;
            float percentage= ((avg/100)*100);
            System.out.println("Total mark="+total);
            //System.out.println("avg"+avg);
            System.out.println("Percentage="+percentage);
        }




}
public class Employee {
    public static void main(String[] arg){
        int emp_id,ass1,ass2,ass3;
        String name;

        Employee1 ob=new Employee1();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee id:");
        emp_id=s.nextInt();
        System.out.println("Enter Employee Name:");
        name=s.next();
        System.out.println("Enter the mark obtained in assessment1:");
        ass1=s.nextInt();
        System.out.println("Enter the mark obtained in assessment2:");
        ass2=s.nextInt();
        System.out.println("Enter the mark obtained in assessment3:");
        ass3=s.nextInt();
        ob.find(ass1,ass2,ass3);
    }
}