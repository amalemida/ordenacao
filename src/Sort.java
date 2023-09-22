public class Sort {

    public void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++)
                if (array[i - 1] > array[i]) {
                    int auxiliar = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = auxiliar;
                }

        }
    }

    public void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("]");
        System.out.println();
    }

}
