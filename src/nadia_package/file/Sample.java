package nadia_package.file;

public class Sample {
    private String name = "nadia4";
    private int age = 25;

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Sample sample = new Sample("nad", 25);
        System.out.println("Name: " + sample.name + ", Age: " + sample.age);

    }
}

