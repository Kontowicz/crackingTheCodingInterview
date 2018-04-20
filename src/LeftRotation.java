import java.util.Scanner;

public class LeftRotation {
    private static int[] RightRotation(int arr[]){
        int last = arr[arr.length-1];
        for(int i=arr.length-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = last;
        return arr;
    }

    private static int[] LeftRotation(int arr[]){
        int first = arr[0];
        for(int i=0; i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = first;
        return arr;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for (int i=0;i<k;i++){
            a = LeftRotation(a);
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
