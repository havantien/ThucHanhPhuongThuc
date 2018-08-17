import java.util.Scanner;

public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số nguyên");
        n = sc.nextInt();
        while (n > 0) {
            tong += n%10;
            n = n/10;
        }
        System.out.println(" tong cac chu so cua n là: " + tong);

    }
}
