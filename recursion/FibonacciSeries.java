import java.util.Scanner;

public class FibonacciSeries {
    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        printFib(0,1,n-2);
    }
}
