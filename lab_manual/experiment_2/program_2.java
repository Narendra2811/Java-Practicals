public class program_2 {

    public static int minimum(int array[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int array[][] = { { 0, 2, 3 }, { 1, 4, 6 }, { 7, 8, 9, } };
        System.out.println("orignal 2D array is:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("minimum number in 2D array is" + " " +  minimum(array));
    }

}
