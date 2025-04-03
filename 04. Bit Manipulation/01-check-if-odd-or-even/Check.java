class Check {
    public static void oddOrEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven(10);
        oddOrEven(11);

    }
}
