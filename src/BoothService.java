public class BoothService extends VoteService{
    @Override
    public String polling(String partyName) {
        System.out.println("Voted for ==> "+partyName);
        return partyName;
    }
}
