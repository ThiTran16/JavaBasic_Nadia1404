package nadia_package.file;

public class Sample2 {
    private String name = "nadia4";
    private int age = 25;

    public Sample2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2("nad", 25);
        System.out.println("Name: " + sample2.name + ", Age: " + sample2.age); // Sửa lỗi: In ra thông tin theo định dạng chính xác
    }
}
