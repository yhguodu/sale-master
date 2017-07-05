package com.yhguodu.sale.common.result;

import com.yhguodu.sale.common.exception.SaleException;

/**
 * Created by Administrator on 2017/7/4.
 */
public class ArkResultGenerator {
    private ArkResultGenerator(){}

    public static <T> ArkResult<T> genSuccess(T data) {
        return new ArkResult<T>(200,"",data);
    }

    public static <T> ArkResult<T> genFail(SaleException e) {
        return new ArkResult<T>(e.getCode(),e.getMessage(),null);
    }
}
