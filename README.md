Part (a) 
import java.util.Scanner;

class decimaltobinary {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter an integer: ");
        
        a = input.nextInt();   
        c = a;                 

        String binary = "";

        while (a > 0) {
            if (a % 2 == 0) {
                a = a / 2;
                b = 0;
            } else {
                a = a - 1;
                a = a / 2;
                b = 1;
            }

            binary = b + binary;
        }

        System.out.println("The binary conversion of " + c + " is " + binary);
    }
}

part (b)
import java.util.*;

public class BinaryArray {
    
    public static int[] decimalToBinaryArray(int num) {
        int temp = num;
        int count = 0;

        // count digits
        while (temp > 0) {
            temp /= 2;
            count++;
        }

        int[] binary = new int[count];

        // fill array from end
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
part(c)
import java.util.Scanner;

public class BinaryString {

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
