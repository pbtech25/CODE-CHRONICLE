public class trappingRainwater {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate reght max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], height[i + 1]);
        }

        int trappedRainwater = 0, waterLevel = 0;

        // loop
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax boundary, rightmax boundary)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = (water level - height[i]) * width(which is 1)
            trappedRainwater += waterLevel - height[i];
        }

        return trappedRainwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    }
}