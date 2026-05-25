class Solution {
    List<List<Integer>>ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
     

solve(0,nums,new ArrayList<>());
return ans;
}

public void solve(int index,int[]nums,List<Integer>temp){

ans.add(new ArrayList<>(temp));

for(int i=index;i<nums.length;i++){
temp.add(nums[i]);

solve(i+1,nums,temp);

temp.remove(temp.size()-1);
}
    }
}