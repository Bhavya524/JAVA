class Solution {
    public int lengthOfLastWord(String s) {
        
        // String s = "I am Prince";

        List<String> list = List.of(s.split(" "));
        String value = (list.get(list.size() - 1));
        int size = (value.length());
        return size;

    }
}
