public class App {
    static int[] vetor = {57,32,25,11,90,63};
    public static void main(String[] args) throws Exception {

        Ordernar ordem = new Ordernar();
        ordem.bubbleSort(vetor);
        System.out.println(vetor);       
    }
}
