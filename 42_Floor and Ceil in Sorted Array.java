public int[] findFloorAndCeiling(int[] arr, int x) {
    // Time Complexity O(logn)
    // Space Complexity O(1)
    int n = arr.length;
    int start = 0, end = n - 1;
    int floor = -1, ceil = -1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == x) {
            return new int[] {arr[mid], arr[mid]};
        } else if (x > arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    if (end == -1) {
        floor = -1;
    } else {
        floor = arr[end];
    }
    if (start == n) {
        ceil = -1;
    } else {
        ceil = arr[start];
    }

    return new int[] {floor, ceil};
}
