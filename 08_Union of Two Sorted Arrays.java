class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // Time Complexity O((n+m)log(n+m))
        // Space Complexity O(n+m)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            set.add(arr2[i]);
        }
        
        ArrayList<Integer> al = new ArrayList<>(set);

        Collections.sort(al);
        
        return al;
    }
}
