import java.util.*;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks is :" + marks[i]);
            sum += marks[i];

        }

        double percentage = (sum) / marks.length;
        System.out.println("percentage is" + percentage + "%");
    }
}