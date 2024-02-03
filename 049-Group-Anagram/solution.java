class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String sortedWord = new String(chrs);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
