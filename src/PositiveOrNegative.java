import java.util.*;
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("Good Going");
        }
    }
}
