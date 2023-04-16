package Greedy;

public class ValidParanthesis {
    public boolean checkValidString(String s) {
        int cmin=0;int cmax = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                cmin++;
                cmax++;
            }else if(ch == ')'){
                cmax--;
                cmin--;
            }else{
                cmax++;
                cmin--;
            }

            if(cmax < 0) return false;
            cmin = Math.max(cmin, 0);
        }

        return cmin == 0;
    }
}
