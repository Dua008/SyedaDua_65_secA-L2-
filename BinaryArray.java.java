import java.util.*;

public class BinaryArray {
    
    public static int[] decimalToBinaryArray(int num) {
        int temp = num;
        int count = 0;

     
        while (temp > 0) {
            temp /= 2;
            count++;
        }

        int[] binary = new int[count];

       
        for (int i = count - 1; i >= 0; i--) {
            binary[i] = num % 2;
            num /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] result = decimalToBinaryArray(num);

        System.out.print("Binary array: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}