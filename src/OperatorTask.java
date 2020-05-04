import java.util.*;
import java.util.Scanner;

public class OperatorTask {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation number");
        int t = sc.nextInt();
        if(t == 1)
        {
            System.out.println("Enter the two numbers for addition");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first + second;
            if(result < 0)
            {
                System.out.println("Oops option 1 is resulting in a negative result" + " " + result);
            }
            else
            {
                System.out.println(result);
            }
        }
        else if(t == 2)
        {
            System.out.println("Enter the two numbers for subtraction");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first - second;
            if(result < 0)
            {
                System.out.println("Oops option 2 is resulting in a negative result" + " " + result);
            }
            else
            {
                System.out.println(result);
            }
        }
        else if(t == 3)
        {
            System.out.println("Enter the two numbers for  multiplication");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first * second;
            if(result < 0)
            {
                System.out.println("Oops option 3 is resulting in a negative result" + " " + result);
            }
            else
            {
                System.out.println(result);
            }
        }
        else if(t == 4)
        {
            System.out.println("Enter the two numbers for division");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first / second;
            if(result < 0)
            {
                System.out.println("Oops option 4 is resulting in a negative result" + " " + result);
            }
            else
            {
                System.out.println(result);
            }

        }
        else if(t == 5)
        {
            System.out.println("Enter the two numbers for average");
            int first1 = sc.nextInt();
            int second2 = sc.nextInt();
            double result = (first1 + second2) / 2;
            if(result < 0)
            {
                System.out.println("Oops option 5 is resulting in a negative result" + " " + result);
            }
            else
            {
                System.out.println(result);
            }

        }
        else if(t > 5 && t < 1)
        {
            System.out.println("Invalid input");
        }

    }
}
