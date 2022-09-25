public class Sorting {

    public static void BubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort --- " + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int pos = i;
            for (int j = i+1; j < arr.length - 1; j++) {
                count++;
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }

        System.out.println("Selection sort --- " + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while (j>=0 && current < arr[j]) {
                count++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("Insertion sort --- " + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 2, 3, 1, 21, 14, -2, 0, 100 };

        // BubbleSort(arr);
        SelectionSort(arr);
        // insertionSort(arr);
    }
}
