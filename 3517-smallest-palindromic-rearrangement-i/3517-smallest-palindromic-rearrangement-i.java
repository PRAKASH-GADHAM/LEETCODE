class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int half = n / 2;

        if (half > 0) {
            mergeSort(arr, 0, half - 1);
        }

        for (int i = 0; i < half; i++) {
            arr[n - 1 - i] = arr[i];
        }

        return new String(arr);
    }

    private void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] L = new char[n1];
        char[] R = new char[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}   