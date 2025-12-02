// EmailSubscriber.java
public class EmailSubscriber implements Observer {
    private String emailAddress;
    private String name;
    
    public EmailSubscriber(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    @Override
    public void update(String news) {
        System.out.println("📧 Email to " + emailAddress + ":");
        System.out.println("Dear " + name + ",");
        System.out.println("Breaking News: " + news);
        System.out.println("-----------------------------------");
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
}