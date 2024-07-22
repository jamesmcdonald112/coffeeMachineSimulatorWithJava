import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double x = scanner.nextDouble();
        double xPow3 = Math.pow(x, 3);
        double xPow2 = Math.pow(x, 2);

        System.out.println(xPow3 + xPow2 + x + 1);
    }
}