class Compare {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "world";
        String string3 = "hello";

        // Creating a new String object
        String str = new String("hello");

        // Comparing strings using equals()
        if (string1.equals(str)) {
            System.out.println("string1 and str are equal.");
        } else {
            System.out.println("string1 and str are not equal.");
        }

        if (string1.equals(string3)) {
            System.out.println("string1 and string3 are equal.");
        } else {
            System.out.println("string1 and string3 are not equal.");
        }

        // Comparing 'str' with another string
        if (str.equals("example")) {
            System.out.println("The string 'str' is equal to 'example'.");
        } else {
            System.out.println("The string 'str' is not equal to 'example'.");
        }
    }
}