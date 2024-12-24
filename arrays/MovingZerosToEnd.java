import java.util.*;

class MovingZerosToEnd{
    public static int[] moveZeros(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
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
        arr = moveZeros(arr);
        System.out.print("Result Array :[");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.print("]");
    }
}