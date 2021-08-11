package com.bobdev.board.util;

import com.bobdev.board.model.ReturnJsonDto;

public class ReturnUtil {

    public static ReturnJsonDto createReturnObject(boolean is_success, String message, Object data, Exception exception) {

        ReturnJsonDto returnJsonDto = ReturnJsonDto.builder().success(is_success).message(message).data(data).build();

        return returnJsonDto;
    }

}
