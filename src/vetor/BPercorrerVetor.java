package vetor;

public class BPercorrerVetor {

    public static void main(String[] args) {

        int[] vetor = {1, 5, 8, 9, 7, 6};

        // Percorrer array crescente
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //Percorrer array inverso

        System.out.println("Invertido");
        for (int u = vetor.length - 1; u >= 0; u--) {
            System.out.println(vetor[u]);
        }


    }
}
