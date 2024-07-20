import java.util.*;

public class B_Fair_Numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                long n = sc.nextLong();
                if (isFair(n)) {
                    System.out.println(n);
                    continue;
                }
                while (!isFair(n)) {
                    n++;
                }
                System.out.println(n);
            }
        }
    }

    public static boolean isFair(long n) {
        long temp = n;
        while (temp > 0) {
            long digit = temp % 10;
            if (digit != 0 && n % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
