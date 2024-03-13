package model;

public class AgeException extends Exception{
    String code;
    String errorMassage;
    public AgeException(String errorCode,String message){
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
