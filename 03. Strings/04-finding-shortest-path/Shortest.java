//Given 4 Directions
class Shortest {
    public static void findShortestPath(String str) {
        int x0 = 0;
        int y0 = 0;
        int x1 = 0;
        int y1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y1++;
            } else if (str.charAt(i) == 'S') {
                y1--;
            } else if (str.charAt(i) == 'E') {
                x1++;
            } else if (str.charAt(i) == 'W') {
                x1--;
            }

        }
        double result = Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2));
        System.out.println("Shortest path to reach origin is : " + result);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        findShortestPath(str);

    }

}
