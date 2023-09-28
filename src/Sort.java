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

    public void selectionSort(int[] array) {
        int i, j, min;

        for (i = 0; i < array.length - 1; i++) {
            min = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
        }
    }
   
    //criar mergeSort
    public void mergeSort(int[] array) {
        int[] aux = new int[array.length];
        mergeSort(array, aux, 0, array.length - 1);
    }
    private void mergeSort(int[] array, int[] aux, int low, int high) {
        if (high <= low)
            return;
        int mid = (low + high) / 2;
        mergeSort(array, aux, low, mid);
        mergeSort(array, aux, mid + 1, high);
        merge(array, aux, low, mid, high);
    }
    private void merge(int[] array, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++)
            aux[k] = array[k];
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid)
                array[k] = aux[j++];
            else if (j > high)
                array[k] = aux[i++];
            else if (aux[j] < aux[i])
                array[k] = aux[j++];
            else
                array[k] = aux[i++];
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
