import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    // Reads in the numbers based on the size provided.
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      int number = in.nextInt();
      numbers[i] = number;
    }

    // Finds the mode (most occurring number).
    int mode = -1;
    int modeCount = 0;
    for (int i = 0; i < size; i++) {
      int count = 0;
      for (int j = 0; j < size; j++) {
        if (numbers[i] == numbers[j]) {
          count++;
        }
      }

      if (count > modeCount) {
        mode = numbers[i];
        modeCount = count;
      }
    }
    System.out.println(mode);
  }
}
