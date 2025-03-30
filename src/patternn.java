import java.util.Scanner;

public class patternn {
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<'A'+(n-i);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            int a=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c='A';
            int b = (2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
                if(j<b)
                    c++;
                else
                    c--;
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        char startChar =(char) ('A'+(n-1));
        for (int i = 0; i < n; i++) {
            for (char ch = startChar; ch >= startChar - i; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        int s=0;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            s+=2;
        }
        for (int i = 0; i < n; i++) {
            s-=2;
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void pattern20(int n){
        int s=2*n;
        for (int i = 0; i < n; i++) {
            s-=2;
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            s+=2;
            for(int j=0;j<n-i-1;j++){
                System.out.print("* ");
            }
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 ||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int l,r,t,b,a;
                l=j;
                t=i;
                r=(2*n-2)-j;
                b=(2*n-2)-i;
                a=Math.min(Math.min(l,r),Math.min(t,b));
                System.out.print(n-a);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines: ");
        int n =sc.nextInt();
        pattern22(n);
    }
}
