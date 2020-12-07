package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(value = "全局统一返回结果")
public class Result {
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回信息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data = new HashMap<>();

    public Result(){}

    public static Result ok(){
        Result result = new Result();
        result.setSuccess(ResultCodeEnum.SUCCESS.isSuccess());
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setSuccess(ResultCodeEnum.ERROR.isSuccess());
        result.setCode(ResultCodeEnum.ERROR.getCode());
        result.setMessage(ResultCodeEnum.ERROR.getMessage());
        return result;
    }

    public Result data(String key,Object value){
        this.data.put(key,value);
        return this;
    }



    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

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

}
