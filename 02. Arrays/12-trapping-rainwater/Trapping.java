/*
 * Given n non negative integers representing an elevation map where the width
 *  of each bar is 1, compute how much water it is able to trap after raining.
 */
class Trapping {
    public static int TotalTrappedwater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightmax[i]);
            // tapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TotalTrappedwater(height));
    }

}
