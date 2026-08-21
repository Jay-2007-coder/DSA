public class advancePattern {
    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);

    }

    public static void Hollow_Rectangle(int totalrow, int totalcol) {
        for (int i = 1; i <= totalrow; i++) {
            for (int j = 1; j <= totalcol; j++) {
                if (i == 1 || i == totalrow || j == 1 || j == totalcol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
