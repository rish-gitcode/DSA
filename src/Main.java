import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    /*public static int calSum(int x,int y){
        return x+y;
    }
    public static int calProduct(int a,int b){
        return a*b;
    }*/
    public static int calFactorial(int x){
        if(x==1 || x==0)
            return 1;
        else
            return x*calFactorial(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        //int b= sc.nextInt();
        //int c = calSum(a,b);
        //System.out.println("Result: "+calProduct(a,b));
        if(a<0){
            System.out.println("factorial of -ve number is not possible");
            return;
        }
        else{
           int r= calFactorial(a);
            System.out.println("Factorial of "+a+" is "+r);
        }
    }
}