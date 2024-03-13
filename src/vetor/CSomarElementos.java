package vetor;

public class CSomarElementos {

    public static void main(String[] args) {

        int[] vetor = {1, 5, 10, 15, 20, 4};

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println(" A soma de todos elementos é = " + soma);

        //Média dos valores no vetor

        int media = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            media /= vetor[i];
        }

        System.out.println(" A media dos elemntos do vetor é = " + media);
    }
}
