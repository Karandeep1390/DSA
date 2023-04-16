package Array_Hard;

import java.util.*;
import java.util.List;

public class pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    row.add(j,1);
                }else{
                    row.add(j,l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            
            l.add(row);
        }
        
        return l;
    }
}
