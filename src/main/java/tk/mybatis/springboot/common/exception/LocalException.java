package tk.mybatis.springboot.common.exception;


/**
 * 系统自定义异常类
 *
 * @author ltf
 * @create 2016-11-04 上午 11:08
 **/
public class LocalException extends Exception {

    private static final long serialVersionUID = -1L;

    private String msgExtention;

    /**
     * 含参数构造器
     *
     * @param errorCode 业务错误码
     */
    public LocalException(String errorCode) {
        super(errorCode);
    }

    /**
     * 含参数构造器
     *
     * @param errorCode 业务错误码
     */
    public LocalException(String errorCode, String msgExtention) {
        super(errorCode);
        this.setMsgExtention(msgExtention);
    }

    public String getMsgExtention() {
        return msgExtention;
    }

    private void setMsgExtention(String msgExtention) {
        this.msgExtention = msgExtention;
    }
}
