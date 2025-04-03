class Ithbit {
    public static void getIthBit(int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        getIthBit(5, 2);

    }

}
