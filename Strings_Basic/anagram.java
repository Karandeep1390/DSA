package Strings_Basic;

public class anagram {
    public boolean isAnagram(String s, String t) {
        int [] character = new int[26];
        for(char ch : s.toCharArray()) character[ch -'a']++;
        for(char ch : t.toCharArray()) character[ch -'a']--;

        for(int freq : character){
            if(freq != 0) return false;
        }
        
        return true;
    }
}
