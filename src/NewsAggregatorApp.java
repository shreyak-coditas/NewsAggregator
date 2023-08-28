import java.util.List;

/**
 * @author shreya
 * News aggregator application
 * that retrieves news articles from a news API and
 * displays them to the user
 */
public class NewsAggregatorApp {

    public static void main(String[] args) {
        // Initialize API service, user interface, and other components
        NewsService apiService = new NewsService();
        UserInterface userInterface = new UserInterface();

        // Fetch news data based on selected category
        List<NewsArticle> articles = apiService.fetchNewsByCategory("technology");

        // Display news articles to the user
        userInterface.displayNewsArticles(articles);

        // Search for specific articles
        userInterface.searchArticles("Java programming", articles);
    }
}
