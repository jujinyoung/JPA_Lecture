package jpabook.jpashop.exception;

public class NoEnoughStockException extends RuntimeException {
    public NoEnoughStockException(String needMoreStock) {
        super();
    }

    public NoEnoughStockException() {
        super();
    }

    public NoEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEnoughStockException(Throwable cause) {
        super(cause);
    }

    protected NoEnoughStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
