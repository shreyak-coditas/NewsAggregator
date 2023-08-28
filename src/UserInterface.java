import java.util.List;

public class UserInterface {

    /**
     * method is used to display the news articles
     * @param articles
     */

    public void displayNewsArticles(List<NewsArticle> articles) {
        // Display news articles with titles, summaries, and publication information
        for (NewsArticle article : articles) {
            System.out.println("Title: " + article.getTitle());
            System.out.println("Summary: " + article.getSummary());
            System.out.println("Publication Date: " + article.getPublicationDate());
            System.out.println();
        }
    }

    /**
     * method is used to search the articles with keyword
     * @param keyword
     * @param articles
     */
    public void searchArticles(String keyword, List<NewsArticle> articles) {
        // Search for articles based on keywords or topics
        for (NewsArticle article : articles) {
            if (article.getTitle().contains(keyword) || article.getSummary().contains(keyword)) {
                System.out.println("Search Result - Title: " + article.getTitle());
            }
        }
    }
}
