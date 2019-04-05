class TriangleBuilder {
    public static void main(String[] args) {
        triangle(5);
        reverseTriangle(8, 0);
    }

    public static void triangle(int n) {
        printStars(n);
        if(n >= 2) {
            triangle(n-1);
        }
    }

    /* n  == number of lines
     * n1 == tracker variable, set to 0 at initial call
     */
    public static void reverseTriangle(int n, int n1) {
        printStars(n1+1);
        if(n>= 2) reverseTriangle(n-1, n1+1);
    }

    /* helper method for printing n stars on one line
     */
    private static void printStars(int n) {
        //prints n stars
        System.out.print("*");

        if(n <= 1) {
            System.out.println("");
        } else {

            printStars(n-1);
        }

    }
}