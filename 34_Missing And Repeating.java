class Solve {
    int[] findTwoElement(int arr[], int n) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        // int[] result = new int[2];
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1); 
        // }
        // for(int i=1; i<=n; i++){
        //     if(map.getOrDefault(i, 0) == 0) result[1] = i;
        //     else if(map.get(i) == 2) result[0] = i;
        // }
        // return result;
        
        
        
        // Time Complexity O(n)
        // Space Complexity O(1)
        long sn = (long) n * (n+1) / 2;
        long sn2 = (long) n * (n+1) * (2*n+1) / 6;
        long s = 0, s2 = 0;
        for(int i=0; i<n; i++){
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }
        long val1 = s - sn;     // x - y (repeating - missing)
        long val2 = s2 - sn2;   // x^2 - y^2
        val2 = val2 / val1;     // x + y
        long x = (val1 + val2) / 2;
        long y = val2 - x;
        int[] result = {(int)x, (int)y};
        return result;
    }
}
