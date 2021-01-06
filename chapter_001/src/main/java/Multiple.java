public class Multiple {
    public static void main(String[] args) {
        for (int first = 1; first < 10; first ++) {
            for (int second = 1; second < 10; second ++) {
                System.out.println(String.format("%d x %d = %d", first, second, first*second));
            }
            System.out.println();
        }
    }
}
