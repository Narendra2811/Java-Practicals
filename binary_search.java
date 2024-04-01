import java.util.*;

public class binary_search {

    public static int binarysearch(int marks[], int key) {
        int start = 0, end = marks.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == marks[mid]) {
                return mid;
            } else if (key < marks[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array elemnet ");
        int marks[] = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("enter key to search");
        int key = sc.nextInt();

        System.out.println("enter key " + key + " is found in position :" + binarysearch(marks, key));

        sc.close();

    }

}
