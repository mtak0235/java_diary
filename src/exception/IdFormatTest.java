package exception;

public class IdFormatTest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IdFormatException{
        if(userId == null) {
            throw new IdFormatException("아이디 눌일걸?");
        }
        else if(userId.length() < 8 || userId.length() > 20) {
            throw new IdFormatException("아이디는 8자에서 20자 까지 쓰세요");
        }
        this.userId = userId;
    }

    public static void main(String[] args) {
        IdFormatTest test = new IdFormatTest();

        String userId = null;
        try {
            test.setUserId(userId);
        } catch (IdFormatException e){
            System.out.println(e.getMessage());
        }

        userId = "1234";
        try {
            test.setUserId(userId);
        } catch (IdFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
