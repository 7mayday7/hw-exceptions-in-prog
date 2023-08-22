public class ArrayChecker {
    public static void main(String[] args) {
        int[][] exampleArray = {
            {1, 2, 3},
            {2, 3, 4},
            {3, 4, 5}
        };

        check2DArray(exampleArray);
    }

    public static void check2DArray(int[][] array) {
        int rows = array.length;
        int cols = rows > 0 ? array[0].length : 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i].length != cols) {
                    System.out.println("Длина строки " + i + " отличается от ожидаемой");
                    break;
                }
                if (array[i][j] != array[j][i]) {
                    System.out.println("Строка " + i + " и столбец " + j + " не требуются");
                    break;
                }
            }
        }
    }
}
