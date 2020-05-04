import java.util.*;
import java.util.Scanner;

public class CharacterUser {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character output");
        Character ch = sc.next().charAt(0);
        Character dh = Character.toLowerCase(ch);
        if(dh == 'a' || dh == 'r' || dh == 'n' || dh == 'o' || dh == 'd' || dh == 'm')
        {
          System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }


    }
}
