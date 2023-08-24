import Factory.PhoneFactory;
import Interfaces.Phone;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        String choice = "samsung";
        Phone phone = phoneFactory.getPhone(choice);
        phone.display();
    }
}