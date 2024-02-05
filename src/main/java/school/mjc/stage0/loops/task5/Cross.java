package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
         if (sideLength <= 0) {
            System.out.println("Invalid size. Please provide a positive size.");
            return;
        }

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                // Print '8' on the diagonal and anti-diagonal
                if (i == j || i + j == sideLength + 1) {
                    System.out.print("8");
                } else {
                    // Print a space for the other positions
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
