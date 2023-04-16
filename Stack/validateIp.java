package Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class validateIp {

    public static List<Integer> validateRequests(List<String> blackListedAPI, List<String> requests){
        
        List<Integer> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(String req : requests){
            boolean flag = true;
            if(map.getOrDefault(req,0) == 2){
                map.put(req, 0);
                flag = false;
            }else{
                map.put(req, map.getOrDefault(map, 0)+1);
                for(String blackList : blackListedAPI){
                    if(req.matches(blackList)) flag = false;
                }
            }

            if(flag)ans.add(0);
            else ans.add(1);
            
        }

        return ans;
    }

    public static void main(String[] args) {
        List<String> blackListedAPI = new ArrayList<>();
        blackListedAPI.add("111.*.255");
        blackListedAPI.add("12.");

        List<String> request = new ArrayList<>();
        request.add("121.3.5.255");
        request.add("12.3.5.255");
        request.add("111.3.5.255");
        request.add("121.3.5.255");

        List<Integer> ans = validateRequests(blackListedAPI, request);
        for(int a : ans) System.out.println(a);


    }
}
