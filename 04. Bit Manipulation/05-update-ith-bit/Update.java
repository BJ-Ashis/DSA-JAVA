class Update {
    public static int updateIthBit(int num, int i, int newBit) {
        int bitMask = ~(1 << i);
        return (num & bitMask) | (newBit << i);
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 1, 1));

    }
}
