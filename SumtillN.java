import java.util.Scanner;
public class SumtillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum till " + n + " is " + sum + "." );
    }
}
