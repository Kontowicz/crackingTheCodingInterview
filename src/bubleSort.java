import java.util.Scanner;

public class bubleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int couneter = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    ++couneter;
                    swap(a,j,j+1);
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n",couneter);
        System.out.printf("First Element: %d\n",a[0]);
        System.out.printf("Last Element: %d\n",a[a.length-1]);
    }

    private static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
