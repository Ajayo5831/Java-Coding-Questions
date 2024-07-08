import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxxCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int name = Integer.parseInt(s.nextLine());
        Map<Integer, Integer> singerCount = new HashMap<>();

        String[] singers = s.nextLine();
        for (String singerStr : singers) {
            int singer = Integer.parseInt(singerStr);
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }

        int maxCount = 0;
        for (int count : singerCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int favouritesingersCount = 0;
        for (int count : singerCount.values()) {
            if (maxCount == count) {
                favouritesingersCount++;
            }
        }

        System.out.println(favouritesingersCount);

    }
}
