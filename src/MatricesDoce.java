public class MatricesDoce {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];

        // Cargar la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz marco:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}