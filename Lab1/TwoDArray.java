package Lab1;
public class TwoDArray {
    public static void main(String[] args) {
        
        int rows = 3;
        int columns = 4;
        int[][] array = new int[rows][columns];

        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = number++;
            }
        }

        System.out.println("The 2D array elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
