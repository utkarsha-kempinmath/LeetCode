class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);   
        return comb(candidates, target, ans, current, 0);
    }
    public List<List<Integer>> comb(int[] can, int target, List<List<Integer>> ans, List<Integer> current, int i){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return ans;
        }
        for(int j=i; j<can.length; j++){
            if(j>i && can[j] == can[j-1]){
                continue;
            }
            if(can[j] > target)
                break;
            current.add(can[j]);
            comb(can, target - can[j], ans, current, j + 1);
            current.remove(current.size()-1);
        }
        return ans;
    }
}