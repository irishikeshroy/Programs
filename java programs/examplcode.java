import java.util.*;
public class examplcode {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        int count = 1;
        Arrays.sort(arr);
        for (int i = 0; i + 1 < n; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) <= 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        System.out.println(Math.max(ans, count));

}
}