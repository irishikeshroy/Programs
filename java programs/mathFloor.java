public class mathFloor {
    public static void main(String[] args) {
        
        //declaring variables
        double x = 50.3/0;
        double y = 0.0;
        double z = -0.0;
        double e = -30.1;
        
        //pringing output for infinite input
        System.out.println("Math.floor(" + x + ") = " + Math.floor(x));

        //printing output for positive and negative input
        System.out.println("Math.floor(" + y + ") = " + Math.floor(y));
        System.out.println("Math.floor(" + z + ") = " + Math.floor(z));

        //printing output for negative input
        System.out.println("Math.floor(" + e + ") = " + Math.floor(e));
    }
}
