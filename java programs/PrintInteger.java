public class PrintInteger {
    public static void main(String[] args) {
    
        int i = 1234;


        // Using the System.out.println() method:
        System.out.println(i);

        // Using the System.out.printf() method with format specifiers:
        System.out.printf( "%d", i );

        // Using the String.valueOf() method to convert the integer to a string:
        System.out.println(String.valueOf(i));

        // Using the Integer.toString() method to convert the integer to a string:
        System.out.println(Integer.toString(i));

        // Using the StringBuilder class:
        System.out.println(new StringBuilder().append(i).toString());


    }
}

//explaination
//
//
//
//
//
//syntax for new line
//System.out.println("Hello World");
//syntax foe new line using /n

