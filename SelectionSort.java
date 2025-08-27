public class SelectionSort {
    public static void PrintArrray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {21, 56,69,43,80,-2,100,-50};

        for (int i = 0; i < arr.length-1; i++) {
            int smaller = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[smaller]>arr[j]) {
                    smaller = j;
                }
            }
            int temp = arr[smaller];
            arr[smaller] = arr[i];
            arr[i] = temp;
        }
        PrintArrray(arr);
    }
}