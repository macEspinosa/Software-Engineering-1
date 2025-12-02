// NewsSubscriptionApp.java
public class NewsSubscriptionApp {
    public static void main(String[] args) {
        System.out.println("=== Real-time News Subscription Service ===\n");
        
        // Create news agency
        NewsAgency newsAgency = new NewsAgency();
        
        // Create subscribers
        Observer lian = new EmailSubscriber("Lian Nerecina", "lian@example.com");
        Observer alyssa = new SMSSubscriber("Alyssa Tuliao", "+639123456789");
        Observer felix = new EmailSubscriber("Felix Faustino", "felix@example.com");
        Observer Nat = new SMSSubscriber("Nat Ortiz", "+639876543213");
        
        // Subscribe users
        System.out.println("\n--- Subscription Phase ---");
        newsAgency.attach(lian);
        newsAgency.attach(alyssa);
        newsAgency.attach(felix);
        
        // Publish first news
        System.out.println("\n--- News Publication 1 ---");
        newsAgency.publishNews("Major breakthrough in quantum computing announced!");
        
        // Add new subscriber
        System.out.println("\n--- New Subscription ---");
        newsAgency.attach(Nat);
        
        // Publish second news
        System.out.println("\n--- News Publication 2 ---");
        newsAgency.publishNews("Stock market reaches all-time high!");
        
        // Unsubscribe a user
        System.out.println("\n--- Unsubscription ---");
        newsAgency.detach(alyssa);
        
        // Publish third news
        System.out.println("\n--- News Publication 3 ---");
        newsAgency.publishNews("Local team wins national championship!");
        
        System.out.println("\n=== Service Summary ===");
        System.out.println("Active subscribers: " + newsAgency.getSubscriberCount());
    }
}