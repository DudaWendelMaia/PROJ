import java.util.ArrayList;

public class NQueens {

    // contagem de quantas soluções pode ter
    private static int sol = 0;

    // tabuleiro
    private static void mostrarTabuleiro(ArrayList<ArrayList<Integer>> tab, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tab.get(i).get(j) == 1) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
        System.out.println();
    }

    // verificação se pode colocar a rainha (coluna)
    private static boolean seguro(ArrayList<ArrayList<Integer>> tab, int N, int lin, int col) {
        int i, j;

        // verifica ataque linha
        for (i = 0; i < N; i++) {
            if (tab.get(lin).get(i) == 1) {
                return false;
            }
        }

        // verifica ataque coluna
        for (i = 0; i < N; i++) {
            if (tab.get(i).get(col) == 1) {
                return false;
            }
        }

        // verifica ataque na primeira diagonal
        for (i = lin, j = col; i >= 0 && j >= 0; i--, j--) {
            if (tab.get(i).get(j) == 1) {
                return false;
            }
        }
        for (i = lin, j = col; i < N && j < N; i++, j++) {
            if (tab.get(i).get(j) == 1) {
                return false;
            }
        }

        // verifica ataque na segunda diagonal
        for (i = lin, j = col; i >= 0 && j < N; i--, j++) {
            if (tab.get(i).get(j) == 1) {
                return false;
            }
        }
        for (i = lin, j = col; i < N && j >= 0; i++, j--) {
            if (tab.get(i).get(j) == 1) {
                return false;
            }
        }

        // não ocorre nehum ataque e a rainha pode ir naquele lugar retorna true
        return true;
    }

    private static void executar(ArrayList<ArrayList<Integer>> tab, int N, int col) {
        if (col == N) {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("Solucao " + (sol + 1) + ":\n");
            mostrarTabuleiro(tab, N);
            sol++;
            return;
        }

        for (int i = 0; i < N; i++) {
            // verifica se é seguro colocar a rainha naquela coluna
            if (seguro(tab, N, i, col)) {
                // insere a rainha (marca com 1)
                tab.get(i).set(col, 1);

                // chamada recursiva
                executar(tab, N, col + 1);

                // remove a rainha (backtracking)
                tab.get(i).set(col, 0);
            }
        }
    }

    public static void main(String[] args) {
        // número de rainhas
        int N = 8;

        // tabuleiro (matriz)
        ArrayList<ArrayList<Integer>> tab = new ArrayList<>();

        // inserindo todas as linhas
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> linha = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                linha.add(0);
            }
            tab.add(linha);
        }

        // imprime todas as soluções
        executar(tab, N, 0);

        // imprime a quantidade de soluções
        System.out.println("\nSolucoes encontradas -> " + sol);
    }
}
