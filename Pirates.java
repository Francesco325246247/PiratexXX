package Pirates;

import ui.UIAuxiliaryMethods;

import java.util.Scanner;

/**
 * Created by Francesco Cozzolino on 19/09/2016.
 */
public class Pirates {

    private void scanFile() {

        Scanner file = UIAuxiliaryMethods.askUserForInput().getScanner();
        CoordinateRow coordinateReader = new CoordinateRow();

        while (file.hasNextLine()) {
            String line = file.nextLine();
            Scanner lineScanner = new Scanner(line).useDelimiter("=");
            coordinateReader.grabLines(lineScanner);
        }

    }

    private void start() {

        scanFile();

    }

    public static void main(String[] args) {
        new Pirates().start();
    }

}

