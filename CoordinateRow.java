package Pirates;

import java.io.PrintStream;
import java.util.Scanner;

class CoordinateRow {

    private PrintStream out;

    public CoordinateRow() {

        out = new PrintStream(System.out);

    }

    public void grabLines(Scanner scanner) {

        scanner.useDelimiter("\\s+");

        while (scanner.hasNextInt()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            grabCoordinate(lineScanner);
        }

    }

    private void grabCoordinate(Scanner scanner) {
        scanner.useDelimiter(",");
        int rows = 13;
        int cols = 13;

        int[][] coordinates = new int[rows][cols];

        while (scanner.hasNextInt()) {
            for (int i = 0; i < coordinates.length; i++) {
                for (int j = 0; j < coordinates[i].length; j++) {
                    coordinates[i][j] = scanner.nextInt();

                    if (j > 0) System.out.print(", ");
                    System.out.print(coordinates[i][j]);
                }

                out.println();
            }

        }

    }
}

