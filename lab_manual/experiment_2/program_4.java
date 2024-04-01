import java.util.*;

public class program_4 {
    public static void Addition(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                c[i][j] = (array1[i][j] + array2[i][j]);
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Substraction(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                c[i][j] = (array1[i][j] - array2[i][j]);
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Multiplication(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int array2[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
        System.out.println("Orignal 2D Array 1 is:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Orignal 2D Array 2 is:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter 1 For Addition \n 2 For Substraction \n 3 For Multiplication");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Option no 1. Adiition Is Choosed");
                Addition(array1, array2);
                break;
            case 2:
                System.out.println("Option no 2. Substraction Is Choosed");
                Substraction(array1, array2);
                break;
            case 3:
                System.out.println("Option no 3. Multiplication Is Choosed");
                Multiplication(array1, array2);
                break;
            default:
                break;
        }
        sc.close();
    }
}
