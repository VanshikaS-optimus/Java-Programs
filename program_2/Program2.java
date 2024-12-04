package Program_2;
/* @Exception Handling
 You will be given two integers x and y as input, you have to compute x/y . 
If  x/y is zero, exception will occur and you have to report it.
*/

import java.util.*;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}