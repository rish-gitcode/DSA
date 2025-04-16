import java.util.*;

public class allDivisor {
    public static void divi(int x) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                num.add(i);
                if ((x / i) != i)
                    num.add(x / i);
            }
        }
        Collections.sort(num);
        for (int n : num) {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("List of all divisors of "+n);
        divi(n);
        /*for(int i=1;i<=n/2;i++){
            if(n%i==0)
                System.out.print(i+", ");
        }
        System.out.print(n);*/
    }
}
