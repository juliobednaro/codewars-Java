package eight.sol5;

public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;
        for (String game: games) {
            String[] scores = game.split(":");
            if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])) points += 3;
            else if (Integer.parseInt(scores[0]) == Integer.parseInt(scores[1])) points += 1;
        }
        return points;
    }
}
