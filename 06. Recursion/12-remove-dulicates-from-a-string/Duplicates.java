class Duplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // Skip duplicate character
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Mark character as seen and add to the result
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        } 
    }

    public static void main(String[] args) {
        String str = "appnnacollage";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]); // Use primitive boolean array
    }
}