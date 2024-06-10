public class BeachGameScores {
    public static void main(String[] args) {
        int[][] scores = {
                {10, 20},
                {15, 25},
                {30, 10},
                {5, 35}
        };
        int team1Total = 0;
        int team2Total = 0;
        for (int i = 0; i < scores.length; i++) {
            team1Total += scores[i][0];
            team2Total += scores[i][1];
        }
        System.out.println("Total score for Team 1: " + team1Total);
        System.out.println("Total score for Team 2: " + team2Total);
    }
}