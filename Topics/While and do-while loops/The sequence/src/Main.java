import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int maxNumber = 0;
        int count = 0;
        int arrLength = scanner.nextInt();
        while (count < arrLength) {
            int n = scanner.nextInt();
            
            if(n % 4 == 0 && n > maxNumber) {
                maxNumber = n;
            }
            count++;
        }

        System.out.println(maxNumber);
    }
}
