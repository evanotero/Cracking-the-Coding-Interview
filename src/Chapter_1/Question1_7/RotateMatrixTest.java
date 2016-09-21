package Chapter_1.Question1_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {
    @Test
    public void rotateMatrix() throws Exception {
        int[][] matrix = new int[5][5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = count++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        RotateMatrix.rotateMatrix(matrix);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}