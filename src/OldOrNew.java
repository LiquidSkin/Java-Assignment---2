import java.util.*;
import java.util.Scanner;

public class OldOrNew {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int t = sc.nextInt();
        if(t % 2 == 1)
        {
            System.out.println("NEW");
        }
        else if(t % 2 == 0 && t >=2 && t <= 5)
        {
            System.out.println("OLD");
        }
        else if(t % 2 == 0 && t >=6 && t <= 30)
        {
            System.out.println("NEW");
        }
        else if(t % 2 == 0 && t >= 30)
        {
            System.out.println("OLD");
        }
    }
}
