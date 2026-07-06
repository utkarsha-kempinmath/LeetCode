class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        return comb(candidates, target, ans, current, 0);
    }
    public static List<List<Integer>> comb(int[] can, int target, List<List<Integer>> ans, List<Integer> current, int i){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return ans;
        }
        if(i>=can.length || target<0){
            return ans;
        }
        current.add(can[i]);
        comb(can, target - can[i], ans, current, i);

        current.remove(current.size()-1);
        comb(can, target, ans, current, i+1);
        return ans;
    }
}