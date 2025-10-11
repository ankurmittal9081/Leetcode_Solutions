// Last updated: 10/11/2025, 4:47:49 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>> map=new HashMap<>();
        int n=str.length;
        for(int i=0;i<n;i++){
            char a[]=str[i].toCharArray();
            Arrays.sort(a);
            String temp=new String(a);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(str[i]);
        }
        return new ArrayList<>(map.values());
    }
}
