public class SinhVien {
    String type = "Junior"; // biến instance
    int SBD = 5; // biến instance
    static String room= "Four"; // biến static
    static String date_year = 4 + "/" + 2025;// biến static

    public void get(){
        System.out.println(type);// static
        System.out.println(SBD);//static
    }
    public static void main(String[] args) {
        String NewStudent = "Nadia"; // Biến local
        int SBD2 = 6; // Biến local
        System.out.println(room);// static
        System.out.println(date_year);//static
        System.out.println(NewStudent);//local
        System.out.println(SBD2);//local
        SinhVien SinhVien = new SinhVien();
        SinhVien.get();
    }
    }




