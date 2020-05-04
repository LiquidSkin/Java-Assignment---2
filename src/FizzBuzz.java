import java.util.*;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args)
    {
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 3 == 0 && number % 5 == 0)
        {
            System.out.println("ConsultaddJAVA Training");
        }
        else if(number % 3 == 0 &&  number % 5 != 0)
        {
            System.out.println("Consultadd");
        }
        else if(number % 3 != 0 && number % 5  == 0)
        {
            System.out.println("JAVA training");

        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
