
public class program_5 {
    public static void sortElemnet(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int min = number[i];
            int min_index = i;
            int temp = 0;

            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < min) {
                    min = number[j];
                    min_index = j;
                }

            }
            // Swapping the element with the smallest one
            temp = number[i];
            number[i] = min;
            number[min_index]=temp;

        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 6, 5, 1, 8, 9, -1, 2, 10, 15 };
        System.out.print("Array elements are : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        sortElemnet(number);
        System.out.print("\nSorted array is : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            
        }System.out.println("");
    }
}

