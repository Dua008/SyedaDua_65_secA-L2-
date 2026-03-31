import java.util.Scanner;

public class binarys55
tring {

    public static String decimalToBinaryString(int num) {
        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String result = decimalToBinaryString(num);

        System.out.println("Binary string: " + result);
    }
}