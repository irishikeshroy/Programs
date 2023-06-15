public class StringCompareToIgnoreCase {
    //give some complex exaqmples of compareToIgnoreCase
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = "Hello World";
        String s5 = "Hello World";
        String s6 = "Hello World";
        String s7 = "Hello World";
        String s8 = "Hello World";
        String s9 = "Hello World";
        String s10 = "Hello World";
    
        System.out.println(s1.compareToIgnoreCase(s2)); 
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s1.compareToIgnoreCase(s5));
        System.out.println(s1.compareToIgnoreCase(s6));
        System.out.println(s1.compareToIgnoreCase(s7));
        System.out.println(s1.compareToIgnoreCase(s8));
        System.out.println(s1.compareToIgnoreCase(s9));
        System.out.println(s1.compareToIgnoreCase(s10));

}
    
    }