class Solution {
    // Function to calculate squared distance from the origin
     int squaredDis(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    // Function to partition the array around a pivot
     int partition(int[][] points, int left, int right) {
        // Last element is chosen as a pivot.
        int[] pivot = points[right];
        int i = left;

        for (int j = left; j < right; j++) {
            // Elements greater than or equal to pivot are placed in the left side of pivot
            if (squaredDis(points[j]) <= squaredDis(pivot)) {
                int[] temp = points[i];
                points[i] = points[j];
                points[j] = temp;
                i++;
            }
        }
        int[] temp = points[i];
        points[i] = points[right];
        points[right] = temp;

        // The correct sorted position of the pivot
        return i;
    }

     void quickSelect(int[][] points, int left, int right, int k) {
        if (left <= right) {
            int pivotIdx = partition(points, left, right);

            // Count of all elements in the left part
            int leftCnt = pivotIdx - left + 1;

            // If leftCnt is equal to k, then we have found the k closest elements
            if (leftCnt == k)
                return;

            // Search in the left subarray
            if (leftCnt > k)
                quickSelect(points, left, pivotIdx - 1, k);
            // Reduce the k by number of elements already covered and search in the right subarray
            else
                quickSelect(points, pivotIdx + 1, right, k - leftCnt);
        }
    }

    // Function to find k closest points to the origin
     int[][] kClosest(int[][] points, int k) {
        quickSelect(points, 0, points.length - 1, k);

        // First k elements of the array will be the closest
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
        }
        return res;
    }
}
