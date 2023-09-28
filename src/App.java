public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 57, 32, 25, 11, 90, 63, 3, 8 };

        
        Sort sort = new Sort();
        sort.printArray(array);;
        sort.bubbleSort(array);
        System.out.println("Bubble Sort");
        sort.printArray(array);
        sort.selectionSort(array);
        System.out.println("Selection Sort");
        sort.printArray(array);
        sort.mergeSort(array);
        System.out.println( "Merge Sort");
        sort.printArray(array);
    }

}
