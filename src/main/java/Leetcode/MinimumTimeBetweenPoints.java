package Leetcode;

public class MinimumTimeBetweenPoints {
    public static void main(String[] args) {

        int[][] points = {{5,2},{0,3},{0,-4},{-4,1}};
        System.out.println(minTimeToVisitAllPoints(points));

    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0, n = points.length;
        for (int i = 0; i < n-1; i++) {
            int deltaX = Math.abs(points[i+1][0] - points[i][0]);
            int deltaY = Math.abs(points[i+1][1] - points[i][1]);
            ans += Math.min(deltaX, deltaY) + Math.abs(deltaX - deltaY);
        }
        return ans;
    }
}
