import java.util.Scanner;

public class largest_smallest {

    public static int getlargest(int marks[]) {
        int largest = Integer.MIN_VALUE;// - infinity

        for (int i = 0; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
        }
        return largest;
    }


    public static int getsmallest(int marks[]) {
        int smallest = Integer.MAX_VALUE;// + infinity

        for (int i = 0; i < marks.length; i++) {
            if (smallest > marks[i]) {
                smallest = marks[i];
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array elemnet ");
        int marks[] = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("largest number is " + getlargest(marks));

        System.out.println("smallest number is " + getsmallest(marks));


    }
}
