public class Main {

    public static void main(int stop) {
        int total = 0;

        for (int i = 1; i < stop; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }

        System.out.println("The sum of multiples of 3 or 5 below " + stop + " is: " + total);
    }

    public static void main(String[] args) {
        int stop = 10;
        main(stop);
    }
}

