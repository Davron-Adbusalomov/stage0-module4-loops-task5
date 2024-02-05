package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
         if (cathetusLength <= 0) {
            System.out.println("Invalid size. Please provide a positive size.");
            return;
        }

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '8' for each position in the triangle
                System.out.print("8");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
