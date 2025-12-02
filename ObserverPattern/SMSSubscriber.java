// SMSSubscriber.java
public class SMSSubscriber implements Observer {
    private String phoneNumber;
    private String name;
    
    public SMSSubscriber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void update(String news) {
        System.out.println("📱 SMS to " + phoneNumber + ":");
        System.out.println("Hi " + name + "! News Alert: " + news);
        System.out.println("-----------------------------------");
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
}