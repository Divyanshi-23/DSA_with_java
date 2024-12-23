import java.util.*;

class MinimumValue{
    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        int i=0;
        while(n>0){
            arr[i] = sc.nextInt();
            i++;
            n--;
        }
        System.out.println("Minimum is: "+minimum(arr));

    }
}
