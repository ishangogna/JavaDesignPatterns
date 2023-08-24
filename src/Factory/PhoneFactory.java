package Factory;

import Implementations.Android;
import Implementations.iPhone;
import Interfaces.Phone;

public class PhoneFactory {
    public Phone getPhone(String phoneId){
        if (phoneId.equals("apple")){
            return new iPhone();
        }
        else if (phoneId.equals("samsung")){
            return new Android();
        }
        return null;
    }
}
