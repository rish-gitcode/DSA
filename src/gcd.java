import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r;
        if(n>m){
            n=n+m;
            m=n-m;
            n=n-m;
        }
        while(n>0){
            r=m%n;
            m=n;
            n=r;
        }
        System.out.println("GCD: "+r);
    }
}
