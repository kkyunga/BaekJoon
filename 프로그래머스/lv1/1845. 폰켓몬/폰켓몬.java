import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int num = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        if (hs.size() > num) {
            return num;
        }
        else {
            return hs.size();
        }
    }
}