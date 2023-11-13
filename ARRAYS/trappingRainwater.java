public class trappingRainwater {
    public static int trappedRainwater(int height[]) {
        // calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate reght max boundary

        // loop
        // water level = min(leftmax boundary, rightmax boundary)
        // trapped water = (water level - height[i]) * width(which is 1)

        return 1;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    }
}