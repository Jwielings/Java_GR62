package Chapter5;

public class NestedForLoop {
    public static void main(String[] args) {

        System.out.println("Tafelmaker: Geef de grootte aan: 10");

        System.out.print("* | ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("--------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.print("* | ");
            for (int j = 1; j <= 10 ; j++) {
                int k = (i*j);
                System.out.print(k + "  ");
            }
            System.out.println();

            // was het de bedoeling hier met een for each loop / ArrayList te werken?

        }
    }
}
