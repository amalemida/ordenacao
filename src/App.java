public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {57,32,25,11,90,63};

        Sort sort = new Sort();
        sort.bubbleSort(array);
        sort.printArray(array);    
    }

}
