// Last updated: 10/5/2025, 3:01:25 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0; i<flowerbed.length; i+=2){
            if(flowerbed[i]==0){
                if(i==flowerbed.length-1 || flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                    if(n==0) return  true;
                }else{
                    i++;
                }
            }
        }
        return n<=0;
    }
}
