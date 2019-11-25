package exceptionHandling   ;

public class MyException extends Exception {

    private static final long serialVersionUID = 4664456874499611218L;
    //Way to create our own Exception for handling it
    private String errorCode="Unknown_Exception";

    public MyException(String message, String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }


}