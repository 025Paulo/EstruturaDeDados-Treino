package ExercicioVetor;

public class VetorMenorElemento {
    public static void main(String[] args) {

        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < vetor[menor]) {
                menor = i;
            }
        }
        System.out.println("O maior elemento do vetor é: " + vetor[menor]);
    }
}

