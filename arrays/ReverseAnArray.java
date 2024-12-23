import java.util.*;

class ReverseAnArray{
    public static int[] reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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

        arr = reverse(arr,0,arr.length-1);

        System.out.println("Reversed Array:[")
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}