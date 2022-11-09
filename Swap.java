
class Test {
    public int a;

    public Test(int a) {
        this.a = a;
    }
}




public class Swap {
    public static void main(String[] arg){
        int x=10;
        int y=15;
        System.out.println("Call by value");
        System.out.println("Before swapping a=" +x+ "\tb="+y);
        swapfunction(x,y);
        System.out.println("After swapping outside function a=" +x+ "\tb="+y);
        System.out.println("\n");
        Test a= new Test(10);
        Test b= new Test(15);
        System.out.println("Call by reference");
        System.out.println("Before swapping a=" +a.a+ "\t b="+b.a);
        swapfunction2(a,b);
        System.out.println("After swapping outside function a="+a.a+"\tb="+b.a);
    }

    public static void swapfunction(int s,int t){
        int z=s;
        s=t;
        t=z;
    }
    public static void swapfunction2(Test a,Test b){
        Test c=new Test(a.a);
        a.a=b.a;
        b.a=c.a;
    }

}

