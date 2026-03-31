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
import java.util.Scanner;
import java.util.ArrayList;

public class binary1conversion {

    public static ArrayList<Integer> binary(int a) {
        ArrayList<Integer> b = new ArrayList<>();

        if (a == 0) {
            b.add(0);
        } else {
            while (a > 0) {
                int c = a % 2;
                b.add(c);
                a = a / 2;
            }

            // reverse list
            int i = 0;
            int j = b.size() - 1;

            while (i < j) {
                int temp = b.get(i);
                b.set(i, b.get(j));
                b.set(j, temp);
                i++;
                j--;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int z = x.nextInt();

        System.out.println("The binary conversion of " + z + " is " + binary(z));
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
