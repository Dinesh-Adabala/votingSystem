package model;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class VoterDataBase {
//    String voterName;
//    int voterIdNo;
//    Date dob;
//    String gender;
    int adharNoDb = 1235;
    public String voteCheck(int adharNo , int dob) throws AgeException {
        // Calendar otpExpiryCalender = Calendar.getInstance();
        // Calendar.getInstance().setTime(d);
       // System.out.println("asdfgh  "+ Calendar.getInstance().getWeekYear());
        int age;
        age = Calendar.getInstance().getWeekYear() - dob;
        if (adharNo==adharNoDb && age>18 ){
            System.out.println("Valid Voter he/his can vote now"+" ==> age :"+age);
        }else {
            System.out.println("Not valid Voter he can't vote now"+" ==> age :"+age);
            throw new AgeException(ErrorCode.AGE_ERROR_002.getCode(), ErrorCode.AGE_ERROR_002.getMessage());
        }


        return null;
    }
    public String registration(String voterName,int dob, String gender,int adharNo) throws RegistrationException{
        if (adharNo==adharNoDb){
            System.out.println("Vote Registered Successfully");

        }else {
            System.out.println("Vote Registered failed");
            throw new RegistrationException(ErrorCode.REGISTRATION_INVALID_ID_001.getCode(),ErrorCode.REGISTRATION_INVALID_ID_001.getMessage());

        }
        return null;
    }

    public String polling(String partyName) {
        System.out.println("Voted for ==> "+partyName);
        return partyName;
    }


}
