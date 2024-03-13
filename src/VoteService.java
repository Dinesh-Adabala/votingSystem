import model.AgeException;
import model.ErrorCode;
import model.RegistrationException;

import java.util.Calendar;
import java.util.Date;

public abstract class VoteService implements Polling,Registration,VoteCheck{
    int adharNoDb = 1235;

    @Override
    public String registration(String voterName, Date dob , String gender,int adharNo) throws RegistrationException {
        if (adharNo==adharNoDb){
            System.out.println("Vote Registered Successfully");

        }else {
            System.out.println("Vote Registered failed");
            throw new RegistrationException(ErrorCode.REGISTRATION_INVALID_ID_001.getCode(),ErrorCode.REGISTRATION_INVALID_ID_001.getMessage());
        }
       return null;
    }

    @Override
    public String voteCheck(int adharNo , int dob) throws AgeException {
        int age;
        age = Calendar.getInstance().getWeekYear() - dob;
        if (adharNo==adharNoDb && age>18 ){
            System.out.println("Valid Voter he/his can vote now"+" ==> age :"+age);
        }else {
            System.out.println("Not valid Voter he/his can't vote now"+" ==> age :"+age);
            throw new AgeException(ErrorCode.AGE_ERROR_002.getCode(), ErrorCode.AGE_ERROR_002.getMessage());
        }
        return null;
    }
}
