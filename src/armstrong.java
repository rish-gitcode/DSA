import java.util.*;

public class armstrong {
    public static boolean armS(int n) {
        int l,x=n,s=0;
        int p=String.valueOf(n).length();
        while (n!=0){
            l=n%10;
            s += Math.pow(l, p);
            n/=10;
        }
        if (s==x)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        boolean t=armS(a);
        if(t==true)
            System.out.println("This is an armstrong number.");
        else
            System.out.println("This is not an armstrong number.");

    }
}
