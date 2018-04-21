import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int n) {
        int value = 0;
        int value2 = 1;
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        for(int i=1; i<n; i++){
            int tmp = value2;
            value2+=value;
            value = tmp;
        }
        return value2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
