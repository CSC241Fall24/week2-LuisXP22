public class Q1WeirdFunction {
    public static int recursiveF(int n) {
        if (n < 3) {
            return n; 
        } else {
            return recursiveF(n - 1) + 2 * recursiveF(n - 2) + 3 * recursiveF(n - 3);
        }
    }

    public static int iterativeF(int n) {
        if (n < 3) {
            return n; 
        }

        
        int f0 = 0;  
        int f1 = 1;  
        int f2 = 2;  
        int result = 0;

        
        for (int i = 3; i <= n; i++) {
            result = f2 + 2 * f1 + 3 * f0; 
            f0 = f1;
            f1 = f2;
            f2 = result;
        }

        return result;
    }
    public static void main(String[] args) {
        int n = 5;
      
        System.out.println("Recursive f(" + n + ") = " + recursiveF(n));
        System.out.println("Iterative f(" + n + ") = " + iterativeF(n));
    }
}
