import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int l,r=0,x=n;
        if(x>0){
        while(x>0){
            l=x%10;
            r=(r*10)+l;
            x/=10;
        }
            System.out.println("The reverse number is "+r);}
        else{
            while((-x)>0){
                l=x%10;
                r=(r*10)+l;
                x/=10;
            }
            System.out.println("The reverse number is "+r);
        }
    }
}
