package ExercicioVetor;

public class VetorMedia {
    public static void main(String[] args) {

        int[] vetor =  {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int soma = 0;
        int media = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            media = soma / vetor.length;

        }
        System.out.println(" A soma de todos elementos é = " + soma);
        System.out.println(" A media de todos elementos é = " + media);

    }
}

