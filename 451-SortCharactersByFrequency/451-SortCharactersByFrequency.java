// Last updated: 10/14/2025, 7:26:06 AM
class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char w:s.toCharArray()){
            map.put(w,map.getOrDefault(w,0)+1);
        }

        ArrayList<Character>l=new ArrayList<>();

         for(Map.Entry<Character,Integer>mp:map.entrySet())
        {
            l.add(mp.getKey());
        }

        Collections.sort(l,(a,b)->map.get(b)-map.get(a));

       StringBuilder sb = new StringBuilder();
        for(char i:l){
            int j=map.get(i);

            while(j--!=0){
                sb.append(i);
            }
        }

        return sb.toString();

    }
}