package Class21stOfMay;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;


public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer het aantal items in:");
        int NUM_ITEMS = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[NUM_ITEMS];

        System.out.println("Voer de waarden van alle items in (gescheiden door een spatie):");
        String values = scanner.nextLine();
        String[] splitArray = values.split(" ");

        if (splitArray.length != NUM_ITEMS) {
            System.out.println("Incorrecte hoeveelheid nummers ingevuld!");
            return;
        }

//        for (int i = 0; i < splitArray.length; i++) {
//            for (int j = 0; j < splitArray.length[i]; j++) {
//                j = Integer.parseInt(j);

        for (int i = 0; i < NUM_ITEMS; i++) {
            array1[i] = Integer.parseInt(splitArray[i]);

        }
        System.out.println(Arrays.toString(array1));
    }
}


        //int valueAsInt = Integer.parseInt(values);









//StringBuilder values = new StringBuilder {}