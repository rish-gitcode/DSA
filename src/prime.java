import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int c=0;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                c++;
                if ((x / i) != i)
                    c++;
            }
        }
        if(c==2)
            System.out.println("It's prime number.");
        else
            System.out.println("It's not prime number.");
    }
}
