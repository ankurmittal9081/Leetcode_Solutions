// Last updated: 10/7/2025, 12:09:30 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int k) {
        ArrayList<Integer> diffArr=new ArrayList<>();
        for(int i=0;i<capacity.length;i++){
            int diff=capacity[i]-rocks[i];
            diffArr.add(diff);
        }
        Collections.sort(diffArr);
        int count=0;
        for(int i=0;i<diffArr.size();i++){
            int diff=diffArr.get(i);
            if(diff<=k){
                k=k-diff;
                count++;
            }
        }
        return count;

    }
}