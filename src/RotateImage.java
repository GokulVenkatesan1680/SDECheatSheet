public class RotateImage {
    public static void main(String[] args) {
    int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    rotate(matrix);
    }

    public static void rotate(int[][] matrix){


        for(int a = 0 ; a < matrix.length; a++){

            for(int b = a ; b < matrix[0].length; b++){
                int temp = matrix[a][b];
                matrix[a][b]=matrix[b][a];
                matrix[b][a] = temp;

            }

        }
        for(int a = 0 ; a < matrix.length; a++){

            for(int b = 0 ; b < matrix[0].length/2; b++){
                int temp = matrix[a][b];
                matrix[a][b]=matrix[a][matrix.length - 1 - b];
                matrix[a][matrix.length - 1 - b] = temp;

            }

        }
    }
}
