public class a3DArray {
    public static void main(String[] args) {
        int my3DArray[][][] = new int[3][4][5]; // 3 2D arrays of 4x5

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    my3DArray[i][j][k] = i * j * k;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++){
                    System.out.print(my3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
