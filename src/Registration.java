import model.RegistrationException;

import java.util.Date;

public interface Registration {
    String registration( String voterName, Date dob ,  String gender , int adharNo)throws RegistrationException;
}
