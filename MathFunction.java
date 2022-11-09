
import java.util.Scanner;

public class MathFunction {
    int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    void multiply(float a, float b) {
         float result = (float) a * b;
         System.out.println("Result=" + result);
    }

    void multiply(float e,int f) {
        float result;
        result = e * f;
        System.out.println("Result=" + result);
    }


    public static void main(String[] arg){
        MathFunction a =new MathFunction();
        System.out.println(a.multiply(10,20));
        a.multiply(1.0f ,2.0f);
        a.multiply(4.6f,10);

    }
}