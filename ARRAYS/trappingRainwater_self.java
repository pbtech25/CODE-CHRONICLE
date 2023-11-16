public class trappingRainwater_self {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // leftmax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // rightmax
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trapped_water = 0, water = 0;
        for (int i = 0; i < n; i++) {
            // compare
            trapped_water = Math.min(leftMax[i], rightMax[i]) - height[i];
            // sum
            water += trapped_water;
        }

        // return
        return water;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        int rain_water = trappedWater(height);

        System.out.println("Total trapped rain water is: " + rain_water);
    }
}
