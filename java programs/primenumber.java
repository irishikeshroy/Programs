public class primenumber {
    //write code for prime number
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        int i = 1;
        while (count < 10001) {
            i = i + 1;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    break;
                }
            }
            if (num == 1) {
                count = count + 1;
            }
        }
        System.out.println("The 10001st prime number is " + i);
    }
}
