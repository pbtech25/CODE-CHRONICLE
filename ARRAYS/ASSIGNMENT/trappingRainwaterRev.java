package ASSIGNMENT;

public class trappingRainwaterRev {
    public static int trappedRainWater(int height[]) {
        int n = height.length, trappedWater = 0, waterLevel = 0;

        // left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // loop
        for (int i = 0; i < n; i++) {
            // water level= min(leftMax, reightMax)
            waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height
            trappedWater += waterLevel - height[i];
        }

        //

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        int trapped_rain_water = trappedRainWater(height);

        System.out.println("Total trapped rain water is: " + trapped_rain_water);
    }
}