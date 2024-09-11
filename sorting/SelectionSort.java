import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr){
        for(int j=0;j<arr.length-1;j++){
            int large = arr[j]; 
            int idx = j;

            for(int i=j+1;i<arr.length;i++){
                if(arr[i]<large){
                    large = arr[i];
                    idx = i;
                }
            }
            arr[idx] = arr[j];
            arr[j] = large;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        SelectionSort.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
