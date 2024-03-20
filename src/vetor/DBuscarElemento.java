package vetor;

import java.util.Scanner;

// Buscar elemento em um vetor pelo Valor
public class DBuscarElemento {

    public static void main(String[] args) {

//        int[] vetor = {1, 2, 3, 4, 5, 6};
//
//        int valorQueEuQueroBuscar = 4;
//
//        for (int i = 0; i < vetor.length; i++) {
//            if (vetor[i] == valorQueEuQueroBuscar) {
//                System.out.println("Está na posição: " + (i + 1));
//            }
//        }

        // Transformar em uma função.
        // Função recebe como parametro o Vetor e o valor a ser buscado.
        // Função retorna a posição do valor no vetor (índice)


        int[] vetor2 = {2, 4, 8, 16, 32, 64};

        int busca = 16;

        for (int u = 0; u < vetor2.length; u++) {
            if (vetor2[u] == busca) {
                System.out.println("O número " + busca + " está na posição: " + (u + 1));
            }

        }
    }
}

