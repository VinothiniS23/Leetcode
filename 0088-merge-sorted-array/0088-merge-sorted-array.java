class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> ob = new ArrayList<>();
        for(int i=0;i<m;i++){
            ob.add(nums1[i]);
        }
         for(int j=0;j<n;j++){
            ob.add(nums2[j]);
        }
        Collections.sort(ob);
       for(int i=0;i<ob.size();i++){
       nums1[i]= ob.get(i);
       }
       
    }
}