import model.AgeException;

public interface VoteCheck {
    String voteCheck(int adharNo , int dob)throws AgeException;
}
