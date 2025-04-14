public class Static {
    // Đây là một phương thức public void
    public void printMessage() {
        System.out.println("Xin chào, thế giới!");
    }

    public static void main(String[] args) {
        // Tạo một instance của lớp Example
        Static example = new Static();

        // Gọi phương thức printMessage
        example.printMessage(); // Điều này sẽ in "Xin chào, thế giới!" ra console
    }
}
