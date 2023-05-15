import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        for (String player : callings) {
            int ownRank = rank.get(player);
            String frontPlayer = players[ownRank - 1];
            
            players[ownRank - 1] = player;
            players[ownRank] = frontPlayer;
            
            rank.put(player, ownRank - 1);
            rank.put(frontPlayer, ownRank);
        }
        return players;
    }
}