//Position this line where user code will be pasted.
class Solution {
  public:
    int SumofMiddleElements(vector<int> &arr1, vector<int> &arr2) {
        // code here
        int n1 = arr1.size();
        int n2 = arr2.size();
        int totalSize = n1 + n2;
        int i = 0, j = 0;
        std::vector<int> merged;

        // Merge the two sorted vectors
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged.push_back(arr1[i]);
                i++;
            } else {
                merged.push_back(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n1) {
            merged.push_back(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < n2) {
            merged.push_back(arr2[j]);
            j++;
        }

        // Find the median
        if (totalSize % 2 == 1) {
            return merged[totalSize / 2];
        } else {
            int mid1 = merged[totalSize / 2 - 1];
            int mid2 = merged[totalSize / 2];
            return mid1 + mid2; // Integer division for median
        }
    }
};
