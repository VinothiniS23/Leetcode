class Solution {
    List<List<Integer>>ans=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0,candidates,target,new ArrayList<>());
return ans;
}

public void solve(int index,int[]candidates,int target,List<Integer>temp){

if(target==0){
ans.add(new ArrayList<>(temp));
return;
}

if(target<0){
return;
}

for(int i=index;i<candidates.length;i++){

temp.add(candidates[i]);

solve(i,candidates,target-candidates[i],temp);

temp.remove(temp.size()-1);
}
    }
}