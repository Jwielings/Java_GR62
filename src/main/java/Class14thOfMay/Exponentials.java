package Class14thOfMay;

public class Exponentials {

    public static void main(String[] args) {

        System.out.println(exponential.exponential(4, 4));

    }
}

class exponential {

    public static int exponential(int base, int exp) {
        int principle;
        principle = base;

        for (int i = 1; i < exp; i++) {
            principle *= base;
        }
        return principle;
    }
}




