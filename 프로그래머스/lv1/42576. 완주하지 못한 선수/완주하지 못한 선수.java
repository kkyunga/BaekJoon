import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }
        for (String k : hm.keySet()) {
            if (hm.get(k) != 0) {
                result = k;
                break;
            }
        }
        return result;
    }
}