package vetor;

// Buscar elemento em um vetor pelo Valor
public class DBuscarElemento {

    public static void main(String[] args) {

        int[] vetor = { 1, 2, 3, 4, 5, 6};

        int valorQueEuQueroBuscar = 4;

        for (int i=0;i<vetor.length;i++) {
            if (vetor[i] == valorQueEuQueroBuscar) {
                System.out.println("Está na posição: " + i);
            }
        }

        // Transformar em uma função.
        // Função recebe como parametro o Vetor e o valor a ser buscado.
        // Função retorna a posição do valor no vetor (índice)

        int[] vetor2 = { 1, 2, 3, 4, 5, 6};

        vetor2[1] = 3;
        vetor2[2] = 6;
        vetor2[3] = 9;
        vetor2[4] = 12;
        vetor2[5] = 15;
        vetor2[6] = 18;

        int Busca = 4;
        int Posicao = 0;

        for (int i=0;i<vetor.length;i++) {
            if (vetor[i] == Busca) {

    }

}