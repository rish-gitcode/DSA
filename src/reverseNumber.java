import java.util.Scanner;

public class reverseNumber {
    public static long revNum(long x){
        long l,r=0;
        if(x>0){
            while(x>0){
                l=x%10;
                r=r*10+l;
                x/=10;
            }}
        else{
            while((-x)>0){
                l=x%10;
                r=r*10+l;
                x/=10;
            }}
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        System.out.println("The reverse number is "+revNum(n));
        /*int l,r=0,x=n;

        while(x!=0){
            l=x%10;
            r=(r*10)+l;
            x/=10;
        }
            System.out.println("The reverse number is "+r);
        */
    }
}
