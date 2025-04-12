import java.util.Scanner;
public class countdigits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
         int n = s.nextInt();
         int c=0;
         if(n>0){
         while(n>0){
             c++;
             n/=10;
         }
         }
         else{
             while((-n)>0){
                 c++;
                 n/=10;
             }
         }
        System.out.println("The number of digits: "+c);
    }
}
