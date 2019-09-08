import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap chu muon kiem tra");
        char chuoi = scanner.next().charAt(0);
        int count = 0;
        String str = "fecafsdsafasfasfsafsafwqfqw";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chuoi) {
                count++;
            }
        }
        System.out.println("so phan tu duoc tim thay :" + count);
    }
}
