import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        int a = sc.nextInt();
        
        System.out.print("Input number 2: ");
        int b = sc.nextInt();
        
        int Total = a + b;
        int Minus = a - b;
        int Plus = a * b;
        double Divide = (b != 0) ? (double)a / b : 0;
        
        System.out.println("Total: " + Total);
        System.out.println("Minus: " + Minus);
        System.out.println("Plus: " + Plus);
        if (b != 0) {
            System.out.println("Divide: " + Divide);
        } else {
            System.out.println("Can't divide for 0");
        }
        
        sc.close();
    }
}
