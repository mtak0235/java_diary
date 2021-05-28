package exception;

public class PwFormatTest {
    private String userPw;

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) throws PwFormatException {
        if (userPw == null) {
            throw new PwFormatException("pw null일껄?");
        }
        else if(userPw.length() <  5){
            throw new PwFormatException("비번은 5자 보다 많아야.");
        }
        else if(!userPw.matches("[a-zA-Z]+")) {
            throw new PwFormatException("비번은 문자여야 해");
        }
        this.userPw = userPw;
    }

    public static void main(String[] args) {
        PwFormatTest test = new PwFormatTest();

        String userPw = null;
        try {
            test.setUserPw(userPw);
        } catch (PwFormatException e) {
            System.out.println(e.getMessage());
        }

        userPw = new String("12dfs2342");
        try {
            test.setUserPw(userPw);
        } catch (PwFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
