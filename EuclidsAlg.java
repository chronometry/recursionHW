class EuclidsAlg {

    public static void main(String[] args) {
        System.out.println(GCF(252, 105));
    }

    public static int GCF(int a, int b) {
        System.out.println(a + ", " + b);
        if(a == b) {
          return a;   
        }
        return GCF(Math.max(a, b) - Math.min(a,b), Math.min(a, b));


    }
}