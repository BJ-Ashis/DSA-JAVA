class ClearLast {
    public static int clearLastIthBit(int num, int i) {
        int bitMask = (~0) << i;
        return num & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }

}
