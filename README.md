# SyedaDua_65_secA-L2-
Assignment: 2 (5679340-Syeda Dua Zehra 16 sec A) 
part (A)
import java.util.Scanner;

class decimaltobinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter an integer: ");
        
        a = input.nextInt();   // number
        c = a;                 // original

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
