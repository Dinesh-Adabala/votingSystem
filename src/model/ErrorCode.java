package model;

public enum ErrorCode {
    REGISTRATION_INVALID_ID_001("REGISTRATION_ERROR_001","INVALID ADHAR NUMBER"),
    AGE_ERROR_002("AGE_ERROR_002","AGE WAS NOT 18+");


    String code;
    String message;

       ErrorCode(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
