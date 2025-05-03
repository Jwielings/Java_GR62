public class ForLoop {
    public static void main(String[] args) {

        //for (int i = 1; i < 8; i ++) {
        //System.out.println(i + " " + (i+1) + " " + (i+2));

        //for (int i = 8; i > 0; i-- ) {
        //System.out.println("(" + i + ", 1)" + "(" + i + ", 2)" + "(" + i + ", 3)" + "(" + i + ", 4)" +  "(" + i + ", 5)" + "(" + i + ", 6)" + "(" + i + ", 7)" + "(" + i + ", 8)");

        for (int i1 = 8; i1 > 1; i1--){
            for (int i2 = 1; i2 < 8; i2++) {
                System.out.print("(" + i1 + ", " + i2 + ")");
            }
        System.out.println(); }
    }
}
