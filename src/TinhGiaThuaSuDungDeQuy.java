
import java.util.Scanner;

public class TinhGiaThuaSuDungDeQuy {
    public static long factorial( long n ) {
        if ( n < 1) {
            return n;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(" tính giai thừa");
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập giai thừa");
        long n = sc.nextLong();
        long fact = factorial(n);
        System.out.println("giai thừa của n là: " + fact);
    }
}
