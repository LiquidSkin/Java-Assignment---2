import java.util.*;
import java.util.Scanner;

public class FlowChartAverage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 inputs");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        if(average > a && average > b && average > c)
        {
            System.out.println("Average is higher than a,b and c");

        }
        else
        {
            if(average > a && average > b)
            {
                System.out.println("Average is higher than a and b");
            }
            else
            {
                if(average > a && average > c)
                {
                    System.out.println("Average is higher than a and c");
                }
                else
                {
                    if(average > b && average > c)
                    {
                        System.out.println("Average is higher than b and c");
                    }
                    else
                    {
                        if(average > a)
                        {
                            System.out.println("average is just higher than a");
                        }
                        else
                        {
                            if(average > b) {
                                System.out.println("average is just higher than b");
                            }
                            else
                            {
                                System.out.println("average is just higher than c");
                            }
                        }
                    }
                }
            }
        }

    }

}
