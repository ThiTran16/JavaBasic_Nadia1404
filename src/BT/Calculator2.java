package BT;

public class Calculator2 {
    public static double tich ( double v, double t) {
        return v*t;
    }
    public static int tong ( int f, int g) {
        return f+g;
    }

    public static void main(String[] args) {
        double kqua = tich(2.3, 2.67);
        System.out.println("Trả về: " + kqua);
        int kqua2 = tong(5, 8);
        System.out.println("Trả về: " + kqua2);
    }

}
