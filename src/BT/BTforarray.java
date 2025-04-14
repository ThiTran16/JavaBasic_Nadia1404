package BT;

public class BTforarray {
    public static void main(String[] args) {
        int a[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                a[index] = i;
                index++;

            }
            }
        System.out.println("Số chẵn từ o đến 50");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
