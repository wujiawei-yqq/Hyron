package entity;

public enum ResultCodeEnum {
    SUCCESS(true,20000,"成功"),
    ERROR(false,20001,"失败");

    private boolean success;

    private Integer code;

    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultCodeEnum(boolean success, Integer code, String message){
        this.success = success;
        this.code =code;
        this.message = message;
    }

}
