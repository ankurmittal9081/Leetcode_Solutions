// Last updated: 10/4/2025, 2:27:32 PM
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> l=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                int bit=Integer.bitCount(h)+Integer.bitCount(m);
                if(bit==turnedOn){
                    l.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return l;
    }
}


