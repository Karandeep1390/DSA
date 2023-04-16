package Two_Pointer_Medium;

public class number_of_substring_containing_all_three_characters {
    public int numberOfSubstring(String s){
        int [] chars = new int[3];

        int count = 0;
        int start = 0;
        
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i) - 'a']++;

            while(chars[0] > 0 && chars[1] > 0 && chars[2] > 0){
                chars[s.charAt(start++) - 'a']--;
                count += s.length()-i;
            }
        }

        return count;
    }
}
