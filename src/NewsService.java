import java.util.ArrayList;
import java.util.List;

public class NewsService {

    /**
     * method is used to fetch the news by category
     * @param category
     * @return the list of newsArticle
     */
    public List<NewsArticle> fetchNewsByCategory(String category) {
        // Simulate fetching news articles from the API
        List<NewsArticle> newsArticleList = new ArrayList<>();
        try {
            NewsArticle newsArticle = getNewsAticle();
            if (category.equalsIgnoreCase(newsArticle.getCategory())) {
                newsArticleList.add(newsArticle);
                return newsArticleList;
            } else {
                System.out.println("Category is not found");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception occured in fetchNewsByCategory method" + e);
        }
        return newsArticleList;
    }

    private NewsArticle getNewsAticle() {
        NewsArticle newsArticle = new NewsArticle();
        newsArticle.setTitle("News Title");
        newsArticle.setSummary("Summary");
        newsArticle.setPublicationDate("2023-08-24");
        newsArticle.setCategory("technology");
        return newsArticle;
    }
}
