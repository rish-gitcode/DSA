import java.util.Scanner;

public class gcd {
    public static int gcd(int n,int m) {
        while(n>0&&m>0){
            if(n>m)
                n=n%m;
            else
                m=m%n;
        }
        if(n==0)
            return m;
        else
            return n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r=gcd(x,y);

        System.out.println("GCD: "+r);
    }
}
