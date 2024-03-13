package model;

public class RegistrationException extends Exception{
    String code;
    String errorMassage;
    public RegistrationException(String errorCode,String message){
        super(message);
        this.code = errorCode;
        this.errorMassage=message;
    }
    public  String getCode(){
        return code;
    }

    public String getErrorMassage() {
        return errorMassage;
    }
}
