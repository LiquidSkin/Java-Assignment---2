import java.util.*;
import java.util.Scanner;

public class FloatProgram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float ft = sc.nextFloat();
        if(ft == 0)
        {
            System.out.println("Zero");
        }
        else if(Math.abs(ft) < 1)
        {
            System.out.println("positive small" + " " + "negative small");

        }
        else if(Math.abs(ft) > 1000000)
        {
            System.out.println("positive large" + " "  + "positive large");
        }
    }
}
