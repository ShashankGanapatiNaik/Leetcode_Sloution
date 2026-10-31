class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer>hmap1=new HashMap<>();
        Map<String,Integer>hmap2=new HashMap<>();
        for(String word:words1){
            hmap1.put(word,hmap1.getOrDefault(word,0)+1);
        }
         for(String word:words2){
            hmap2.put(word,hmap2.getOrDefault(word,0)+1);
        }
        int count=0;
        for(String a:hmap1.keySet()){
            if(hmap1.get(a)==1 && hmap2.getOrDefault(a,0)==1){
                count++;
            }

        }
        return count;
    }
}