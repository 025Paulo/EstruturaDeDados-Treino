package ExercicioVetor;

import java.util.Arrays;

public class VetorAdicionaNovo {

    public static void main(String[] args) {

        int[] vetor = {};
        vetor = add(vetor, 1);
        vetor = add(vetor, 2);
        vetor = add(vetor, 3);
        vetor = add(vetor, 4);
        vetor = add(vetor, 5);

        System.out.println(Arrays.toString(vetor));
    }
    public static int[] add(int[] vetor, int valor) {
        int[] vetor1 = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            vetor1[i] = vetor[i];
        }

        vetor1[vetor.length] = valor;

        System.out.println(Arrays.toString(vetor1));


        return vetor1;

    }

}

