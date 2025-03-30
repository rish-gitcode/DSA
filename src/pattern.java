import java.util.Scanner;

public class pattern {
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(i*2+1);j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(i*2+1);j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            int s;
            if(i%2==0){
                s=0;}
            else {
                s=1;}
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s = 1-s;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        int s=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            System.out.println();
            s-=2;
        }
    }
    public static void pattern13(int n){
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            int a=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)a);
                a++;
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines: ");
        int n =sc.nextInt();
        pattern14(n);
    }
}
