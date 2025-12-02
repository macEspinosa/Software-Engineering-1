// NewsAgency.java
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String latestNews;
    private List<Observer> subscribers;
    
    public NewsAgency() {
        this.subscribers = new ArrayList<>();
        this.latestNews = "No news yet";
    }
    
    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
        System.out.println("✅ New subscriber added. Total subscribers: " + subscribers.size());
    }
    
    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
        System.out.println("❌ Subscriber removed. Total subscribers: " + subscribers.size());
    }
    
    @Override
    public void notifyObservers() {
        System.out.println("\n📢 Broadcasting breaking news to " + subscribers.size() + " subscribers...");
        for (Observer subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
    
    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n🚨 NEWS AGENCY PUBLISHES: " + news);
        notifyObservers();
    }
    
    public int getSubscriberCount() {
        return subscribers.size();
    }
}