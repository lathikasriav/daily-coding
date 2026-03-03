import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();  // number of queries
        
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            
            for (int j = 0; j < n; j++) {
                sum += (Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            
            System.out.println();
        }
        
        in.close();
    }
}