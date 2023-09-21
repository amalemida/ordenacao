public class Ordernar {

    public void bubbleSort(int[] vetor) {
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 1; i < vetor.length; i++)
                if (vetor[i-1] > vetor[i ]) {
                    int auxiliar = vetor[i-1];
                    vetor[i-1] = vetor[i];
                    vetor[i] = auxiliar;
                }

        }
    }
    
}
