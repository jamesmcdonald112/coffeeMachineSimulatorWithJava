import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        while(true) {
            int n = scanner.nextInt();
            if(n == 0) {
                break;
            } else {
                sum += n;
            }
            
        }
        System.out.println(sum);
    }
}
