class Largest {
    public static void main(String[] args) {
        // 0 means equal
        // <0 : -ve means str1 < str2
        // >0 : +ve means str2 > str1
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    } 

}
