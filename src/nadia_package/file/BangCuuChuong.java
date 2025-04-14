package nadia_package.file;

public class BangCuuChuong {
    public static int CuuChuong9(int i){// khai báo biến toàn cục
        return 9 * i;
    }

    public static void main(String[] args) {
        // in bảng cửu chương 9
        for (int j = 1; j <= 10 ; j++) {
            System.out.println("9 * " + j + " =" + CuuChuong9(j));

        }
    }
}
