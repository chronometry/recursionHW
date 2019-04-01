class TriangleBuilder {
    public static void main(String[] args) {
        triangle(5);
        reverseTriangle(8);
    }

    public static void triangle(int n) {
        for(int i = 0; i < n; i++) {
          printStars(i);  
        } 
    }

    public static void reverseTriangle(int n) {
         for(int i = 0; i < n; i++) {
          printStars(n-i);  
        }  
    }

    private static void printStars(int n) {
        for(int i = 0; i < n; i++) {
          System.out.print("*");
        }
        System.out.println("*");
    }
}