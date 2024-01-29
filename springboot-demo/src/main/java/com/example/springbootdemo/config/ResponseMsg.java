package com.example.springbootdemo.config;

import com.example.springbootdemo.exception.BaseException;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseMsg<T> {
    private static final int SUCCESS = 0;
    private boolean flag;
    private int code;
    private String desc;
    private T data;

    public ResponseMsg(boolean flag, int code, String desc, T data) {
        this.flag = flag;
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public static <T> ResponseMsg<T> success() {
        return new ResponseMsg<>(true, SUCCESS, "成功", null);
    }

    public static <T> ResponseMsg<T> success(T data) {
        return new ResponseMsg<>(true, SUCCESS, "成功", data);
    }

    public static <T> ResponseMsg<T> success(String message, T data) {
        return new ResponseMsg<>(true, SUCCESS, "成功", data);
    }

    public static <T> ResponseMsg<T> failed(int code, String message, T data) {
        return new ResponseMsg<>(false, code, message, data);
    }

    public static <T> ResponseMsg<T> failed(int code, String message) {
        return new ResponseMsg<>(false, code, message, null);
    }

    public static <T> ResponseMsg<T> failed(BaseException e) {
        return new ResponseMsg<>(false, e.getCode(), e.getErrorMsg(), null);
    }
}
