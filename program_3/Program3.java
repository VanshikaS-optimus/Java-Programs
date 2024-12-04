/* @String

Given two numbers as strings. The numbers may be very large (may not fit in long long int).
The task is to find sum of these two numbers.*/

package Program_3;

import java.math.BigInteger;
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);

        BigInteger ans = x.add(y);
        System.out.println(ans);
        sc.close();
    }
}
