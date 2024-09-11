import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
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
