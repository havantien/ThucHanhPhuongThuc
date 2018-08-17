public class TinhTienLaiNganHang {
    public static double caculateInterest(double loans, double intersest_rate, double range) {
        return  loans* ((intersest_rate + range)/12);
    }

    public static void main(String[] args) {
        double loans = 6000;
        double intersest_rate = 0.075;
        double months = 60;
        double range;
        double capital = loans/months;
        System.out.println(" Tiền trả " + months +  " tháng" + capital);
        range = 0;
        double first_year_interest = caculateInterest(loans, intersest_rate , range );
        System.out.println(" tiền lãi năm đầu  " + first_year_interest);
        range = 0.035;
        double next_year_interest = caculateInterest(loans, intersest_rate , range );
        System.out.println(" tiền lãi năm tiếp theo  " + next_year_interest);
    }
}
