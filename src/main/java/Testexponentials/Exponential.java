package Testexponentials;

public class Exponential {
    public int exponential(int base, int exp) {
        int principle;
        principle = base;

        for (int i = 1; i < exp; i++) {
            principle *= base;
        }
        return principle;
    }
}

