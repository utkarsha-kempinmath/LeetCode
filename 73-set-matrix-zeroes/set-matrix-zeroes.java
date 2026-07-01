class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> is = new ArrayList<>();
        ArrayList<Integer> js = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    is.add(i);
                    js.add(j);
                }
            }
        }
        for(int i=0; i<is.size(); i++){
            for(int j=0; j<matrix[is.get(i)].length; j++){
                matrix[is.get(i)][j] = 0;
            }
        }
        for(int i=0; i<js.size(); i++){
            for(int j=0; j<matrix.length; j++){
                matrix[j][js.get(i)] = 0;
            }
        }
    }
}