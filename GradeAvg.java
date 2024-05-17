public class GradeAvg {
    public static void main(String[] args) {
        // Initialize quiz scores
        double quizScore1 = 81.5;
        double quizScore2 = 90.0;
        double quizScore3 = 33.3;

        // Initialize test scores
        double testScore1 = 78.3;
        double testScore2 = 79.7;

        // Calculate quiz and test score averages
        double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
        double testScoreAvg = (testScore1 + testScore2) / 2;

        // Print out the averages
        System.out.println("Quiz Score Average: " + quizScoreAvg);
        System.out.println("Test Score Average: " + testScoreAvg);
    }
}

