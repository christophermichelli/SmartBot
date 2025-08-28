package smartbots;

import java.util.List;

public class ResponseRanker {

    // Returns the FAQ that best matches the user query
    public static FAQ getBestMatch(String query, List<FAQ> faqs) {
        query = query.toLowerCase().trim();
        FAQ bestFAQ = null;
        int highestScore = 0;

        for (FAQ faq : faqs) {
            int score = calculateScore(query, faq.getQuestion().toLowerCase());
            if (score > highestScore) {
                highestScore = score;
                bestFAQ = faq;
            }
        }

        // Only return a match if it has some relevance
        return (bestFAQ != null && highestScore > 0) ? bestFAQ : null;
    }

    // Calculates a relevance score between query and FAQ question
    private static int calculateScore(String query, String question) {
        int score = 0;

        String[] queryWords = query.split("\\s+");
        String[] questionWords = question.split("\\s+");

        // Keyword matching
        for (String qWord : queryWords) {
            for (String fWord : questionWords) {
                if (fWord.startsWith(qWord)) {  // partial match
                    score += 2;  // exact or prefix match gets more points
                } else if (levenshteinDistance(qWord, fWord) <= 1) { // minor typo
                    score += 1;  // small typo tolerance
                }
            }
        }

        return score;
    }

    // Simple Levenshtein distance implementation for typo tolerance
    private static int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) dp[i][0] = i;
        for (int j = 0; j <= b.length(); j++) dp[0][j] = j;

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                        Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return dp[a.length()][b.length()];
    }
}