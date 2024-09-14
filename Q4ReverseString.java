public class Q4ReverseString {
    public static void main(String[] args) {
        String input = "test string";
        String reversed = reverse(input);
        System.out.println(reversed); 
    }
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
      
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
