public class Main {
    public static void main(String[] args) {
        System.out.print("*");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
