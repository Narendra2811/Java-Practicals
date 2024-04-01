import java.util.*;



public class linear_search {

    public static  int linear (int marks[], int n) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == n) {
                return i;
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

        System.out.println("Enter the element you want to search");
        int n = sc.nextInt();

        int position = linear(marks, n);

        if (position == -1) {
            System.out.printf("%d is not present in the array", n);
        } else {
            System.out.println("your search element is " + marks[position] + "is found in position" + position);
        }
        sc.close();
    }
}
