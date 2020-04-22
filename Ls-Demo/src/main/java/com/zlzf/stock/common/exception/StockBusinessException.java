package com.zlzf.stock.common.exception;
import org.ylinkpay.core.constant.NameValueEnum;
import org.ylinkpay.core.exception.BusinessRuntimeException;

/**
 * 
 * @author lyg
 *
 */

public class StockBusinessException extends BusinessRuntimeException{
	
	private static final long serialVersionUID = -6297196586332844343L;
	
	public StockBusinessException(String message) {
		super("0000",message);
	}
	
	public StockBusinessException(final String code, final String message) {
        super(code, message);
    }
	
	public StockBusinessException(NameValueEnum nameValueEnum) {
        super(nameValueEnum.getParam(),nameValueEnum.getDisplayName());
    }
	
}
