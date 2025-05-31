public class MatricesDiez{
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] sumaFilas = new int[5];
        int[] sumaColumnas = new int[5];

        // Cargar la matriz con valores aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        // Sumar filas y columnas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | Suma fila " + i + ": " + sumaFilas[i]);
        }

        // Mostrar suma de columnas
        System.out.print("Suma de columnas: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(sumaColumnas[j] + " ");
        }
    }
}

