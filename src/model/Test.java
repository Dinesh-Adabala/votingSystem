package model;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Test {
     // static int dob = 1997;

    public static void main(String[] args) {
        VoterDataBase voterDataBase = new VoterDataBase();
        try {
            voterDataBase.voteCheck(1235,2017);
        } catch (AgeException e) {
            System.out.println(e.getCode());
        }
        try {
            voterDataBase.registration("Dinesh",2017,"male",123);
        } catch (RegistrationException e) {
            System.out.println(e.getCode());
        }
        voterDataBase.polling("JANASENA");



   }
}
