class Palindrome {
    public static boolean palindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "malayalam";
        boolean result = palindrome(str);
        if (result) {
            System.out.println("Given string is an palindrome");
        } else {
            System.out.println("Given string is not an palindrome");
        }
    }
}