public class RectangleDecreasing {
    public static void main(String[] args) {
        int rows = 4, cols = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = cols; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}