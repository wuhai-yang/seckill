package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by wuhaiyang on 19/08/14
 */
public class SeckillCloseException extends RuntimeException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
