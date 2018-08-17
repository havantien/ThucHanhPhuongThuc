import java.util.Scanner;

public class TimSoDoiXung {
    public static void main(String[] args) {
        int n;
        int reverse = 0;
        int dem;
        int temp;
        System.out.println(" nhap so n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while ( temp > 0) {
            dem = temp % 10;
            reverse = reverse*10 + dem;
            temp /= 10;
        }
        if(reverse == n)
            System.out.println(" n la số đối xứng");
        else
            System.out.println(" không là số đối xứng");
    }
}
