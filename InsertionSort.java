public class InsertionSort {
    public static void PrintArrray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {43, 52, 999, -8, -3, 6, 55, 78, 67};

        for (int i = 1; i < arr.length; i++) {
            int greater = arr[i];
            int j = i-1;
            while (j>=0 && greater < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = greater;
        }
        PrintArrray(arr);
    }
}
