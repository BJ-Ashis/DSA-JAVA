class Char {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int latter = 1; latter <= line; latter++) {
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }
    }
}
