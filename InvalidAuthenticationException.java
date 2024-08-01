public class InvalidAuthenticationException extends Exception{
    @Override
    public String getMessage() {
        return "Please enter the correct email address and password for the user!!!";
    }
}
