// User function template for C++

class Solution {
  public:
    string minSum(vector<int> &arr) {
        // code here
        int n = arr.size();

        // Sort the array to get the numbers in ascending order
        sort(arr.begin(), arr.end());

        // Two strings for storing the two minimum numbers
        string a = "", b = "";

        // Distribute digits to form two numbers with minimum possible sum
        for (int i = 0; i < n; i += 2) {
            a += (arr[i] + '0');
        }
        for (int i = 1; i < n; i += 2) {
            b += (arr[i] + '0');
        }

        int j = a.length() - 1;
        int k = b.length() - 1;
        int carry = 0;
        string ans = "";

        // Perform addition of two strings as if they were large numbers
        while (j >= 0 && k >= 0) {
            int sum = (a[j] - '0') + (b[k] - '0') + carry;
            ans += to_string(sum % 10);
            carry = sum / 10;
            j--;
            k--;
        }

        // If there are remaining digits in a
        while (j >= 0) {
            int sum = (a[j] - '0') + carry;
            ans += to_string(sum % 10);
            carry = sum / 10;
            j--;
        }

        // If there are remaining digits in b
        while (k >= 0) {
            int sum = (b[k] - '0') + carry;
            ans += to_string(sum % 10);
            carry = sum / 10;
            k--;
        }

        // If carry is left
        if (carry) {
            ans += to_string(carry);
        }

        // Remove leading zeroes from the end
        while (!ans.empty() && ans.back() == '0') {
            ans.pop_back();
        }

        // Reverse the result since it was built backwards
        reverse(ans.begin(), ans.end());

        return ans.empty() ? "0" : ans;
    }
};
