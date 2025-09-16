// Last updated: 9/16/2025, 9:33:44 AM
class Solution {
    public boolean isHappy(int n) {

        // if(n==0){
        //     return false;
        // }
        HashSet<Integer> set=new HashSet<>();

        while(n!=1 &&!set.contains(n)){
            set.add(n);
            n=help(n);

        }

        return n==1;
    }

    static int help(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}