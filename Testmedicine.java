
class Medicine{
    public void displayLabel() {
        System.out.println("Company:Globex Pharma");
        System.out.println("Address: Banglore");

    }
}
class Tablet extends Medicine{
    public void displayLabel() {
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine{
    public void displayLabel() {
        System.out.println("Consumption as directed by the physician");
    }
}
class Ointment extends Medicine{
    public void displayLabel() {
        System.out.println("For external use only");
    }
}


public class Testmedicine {
    public static void main(String[]arg){
        Medicine m[]=new Medicine[10];
        double i=Math.random()*4;
        int j=(int)i;
        System.out.println(j);
        switch (j){
            case 1: m[0]=new Medicine();
                   m[1]=new Tablet();
                   m[0].displayLabel();
                   m[1].displayLabel();
                   break;
            case 2: m[2]=new Medicine();
                   m[3]=new Syrup();
                   m[2].displayLabel();
                   m[3].displayLabel();
                   break;
            case 3: m[4]=new Medicine();
                   m[5]=new Ointment();
                   m[4].displayLabel();
                   m[5].displayLabel();
                   break;

            default:System.out.println("INVALID CHOICE");

        }
    }
}
