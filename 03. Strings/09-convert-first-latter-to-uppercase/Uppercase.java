class Uppercase {
    public static void convertUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && i < str.length() - 1) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "hi, i am ashis";
        convertUppercase(str);
    }
}
