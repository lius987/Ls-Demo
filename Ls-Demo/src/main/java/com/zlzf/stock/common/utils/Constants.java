package com.zlzf.stock.common.utils;

import org.ylinkpay.core.util.MD5Utils;

public class Constants {
	public static final String SESSION_USER = "session_user";
	public static final String SESSION_ROLE = "session_role";
	public static final String SESSION_PROLES = "session_proles";
	public static final String SESSION_ROLES = "session_roles";
	public static int MAX_ALERT_TIME = 50;
	public static final String CHECK_FLAG = "check_flag";
	public static final String REQ_ERR_INFO = "req_err_info";
	public static final String VALIDATE_CODE = "validate_code";
	public static final String MCRYPT_KEY = "mcrypt_key";

	public static final String PARAM_MAP = "PARAM_MAP";
	public static String USER_ROLES = "user_roles";
	
	public static final String EXCEPTION_OBJECT = "exception_object";
	
	/** login account  */
	public static final String LOGIN_ACCOUNT = "login_account";

	// 用户输入密码错误次数
	public static final String SESSION_ERR_PASSWORD_TIME = "session_err_password_time";
	// 用户最多能输入的错误次数
	public static final int ERR_PASSWORD_TIME = 5;

	public static String TIME_STAMP="time_stamp";
	/***是否检查密码*/
	public static boolean FLAG_CHECK_CODE=true;
	
	/**
     * 毫秒时间
     */
    public static final String FORMAT_MILLISECOND = "yyyyMMddHHmmssSSS";
	//产品表主键序列
	public static final String ZF_STOCK_PRODUCTID = "S_ZF_STOCK_PRODUCTID";
	public static final String ZF_STOCK_USERID = "S_ZF_STOCK_USERID";
	
	//获取自动登出后访问的地址
//	public static final String HOME_PAGE = ReadProperties.getProperties("HOME_PAGE");
	
	/**
	 * format日期时间（不带横杠）
	 */
	public static final String FORMAT_DATE_TIME = "yyyyMMddHHmmss";
	
	/**
	 *初始化用密码
	 */
	public static final String INIT_PASSWORD = MD5Utils.MD5("123456");
	
	public static final String PRODUCT_COMPANY= "产品发行企业";
	
	public static final String ZLZF_STOCK_TRADE_TIME = "ZLZF_STOCK_TRADE_TIME";
	
	/**
	 * 用于区分管理员和普通操作员
	 * 1 代表普通操作员
	 */
	public static final String ROLE_TYPE_OP = "1";
	
	/**
	 * 常量0
	 */
	public static final String ZLZF_STOCK_0 = "0";
	
	/**
	 * 常量1
	 */
	public static final String ZLZF_STOCK_1 = "1";
	
	/**
	 * 常量2
	 */
	public static final String ZLZF_STOCK_2 = "2";
	
	/**
	 * 常量yes
	 */
	public static final String ZLZF_STOCK_YES = "yes";
	
	/**
	 * 常量no
	 */
	public static final String ZLZF_STOCK_NO = "no";
	
	/**
	 * 产品和产品户编号均使用这个开头
	 */
	public static final String ZLZF_STOCK_PD = "PD";
	
	/**
	 * 协助审核员角色编号
	 */
	public static final String ZLZF_STOCK_AUDITOR = "11";
	
	/**
	 * 登录时生成页面验证码使用
	 */
	public static final int ZLZF_STOCK_CODE = 255;
	
	/**
	 * 批量结算发起的最多次数
	 */
	public static final int BATCH_SETTLE_TIMES = 10;
	public static String CPFXQY_ROLENAME = "产品发行企业";
	
	//-----------------FTP相关-------------
	
	public static final String PARAM_GROUP_FTP = "FTPSTOCK";//系统参数组:FTP相关
	
	public static final String PARAM_NAME_FTPURL="url";//ftp服务器的IP地址
	
	public static final String PARAM_NAME_FTPPORT="port";//ftp服务器的服务端口
	
	public static final String PARAM_NAME_USERZLRT="userzlrt";//ftp服务器的用户名
	
	public static final String PARAM_NAME_PWDZLRT="pwdzlrt";//ftp服务器的密码
	
	public static final String PARAM_NAME_SEALPDFPATH="SEALPDFPATH";//ftp 存放已签章pdf目录
	
	public static final String PARAM_NAME_NOSEALPDFPATH="NOSEALPDFPATH";//ftp 存放未签章pdf目录
	
	//------------------短信通知内容 相关-------------------
	/**
	 * ［证联支付］您好，统一结算平台有一笔
	 */
	public static String SMS_CONTENT_HEAD="［证联支付］您好，统一结算平台有一笔";
	/**
	 * ，金额
	 */
	public static String SMS_CONTENT_MONEY="，金额";		
	/**
	 * ，收款账号：
	 */
	public static String SMS_CONTENT_INCOMEID="，收款账号：";
	/**
	 * 元，用途：
	 */
	public static String SMS_CONTENT_MONEY_DS="元，用途：";
	/**
	 * ，到账情况以银行通知为准。
	 */
	public static String SMS_CONTENT_WD_END="，到账情况以银行通知为准。";	
	/**
	 * ，请及时登录结算平台查询。
	 */
	public static String SMS_CONTENT_END="，请及时登录结算平台查询。";
	/**
	 * 提现订单已受理，金额
	 */
	
	public static String SMS_CONTENT_WD_HEAD="提现订单已受理，金额";
	/**
	 * 充值资金已入账，收款账号：
	 */
	public static String SMS_CONTENT_RG_HEAD="充值资金已入账，收款账号：";
	/**
	 * 划拨资金已到账，收款账号：
	 */
	public static String SMS_CONTENT_HB_HEAD="划拨资金已到账，收款账号：";
	/**
	 * 提取资金已到账，付款账号：
	 */
	public static String SMS_CONTENT_TQ_HEAD="提取资金已到账，付款账号：";	
	/**
	 * 兑付订单已受理，金额
	 */
	public static String SMS_CONTENT_DF_HEAD="兑付订单已受理，金额";	
	/**
	 * 转账订单已受理，付款账号：
	 */
	public static String SMS_CONTENT_TR_OUT_HEAD="转账订单已受理，付款账号：";	
	/**
	 * 转账资金已到账，付款户名：
	 */
	public static String SMS_CONTENT_TR_IN_HEAD="转账资金已到账，付款户名：";	
	/**
	 * 转账订单已受理，付款户名：
	 */
	public static String SMS_CONTENT_TR_CARD_IN_HEAD="转账订单已受理，付款户名：";	
	/**
	 * 结算资金转出，付款账号：
	 */
	public static String SMS_CONTENT_JS_OUT_HEAD="结算资金转出，付款账号：";	
	/**
	 * 结算资金转入，金额
	 */
	public static String SMS_CONTENT_JS_IN_HEAD="结算资金转入，金额";	
	/**
	 * 还款订单已处理成功，付款账号：
	 */
	public static String SMS_CONTENT_HK_OUT_HEAD="还款订单已处理成功，付款账号：";
	/**
	 * 还款订单已到账，付款户名：
	 */
	public static String SMS_CONTENT_HK_IN_HEAD="还款订单已到账，付款户名：";	
	/**
	 * 贴息订单已处理成功，付款账号：
	 */
	public static String SMS_CONTENT_TX_IN_HEAD="贴息订单已处理成功，付款账号：";
	/**
	 * 贴息资金已到账，付款户名：
	 */
	public static String SMS_CONTENT_TX_OUT_HEAD="贴息资金已到账，付款户名：";	
	/**
	 * 认购订单已处理成功，付款账号：
	 */
	public static String SMS_CONTENT_RG_IN_HEAD="认购订单已处理成功，付款账号：";
	/**
	 * 认购资金已到账，付款户名：
	 */
	public static String SMS_CONTENT_RG_OUT_HEAD="认购资金已到账，付款户名：";
	/**
	 * 资金订单等待审核，付款户名：
	 */
	public static String SMS_CONTENT_ZJDD_HEAD="资金订单等待审核，付款户名：";
	/**
	 * ，请您尽快登陆结算平台处理。
	 */
	public static String SMS_CONTENT_ZJDD_END="，请您尽快登陆结算平台处理。";
	/**
	 * 系统标识
	 */
	public static String ZLZF_STOCK = "ZLZF_STOCK";
	/**
	 * 签章接口路径
	 */
	public static String NEW_SIGN_SEAL = "/newSignSeal";
	/**
	 * 签章并保存到文件系统接口路径
	 */
	public static String SIGN_SEAL = "/signSeal";
	/**
	 * 查询签章文件接口路径
	 */
	public static String FIND_DOC_BYSEQID = "/findDocBySeqId";
	/**
	 * 从签章系统下载文件接口路径
	 */
	public static String FIND_DFS_BYPATH = "/fastDFS/downFile";
	/**
	 * 下载文件
	 */
	public static String FAST_DFS_DOWN_FILE = "/fastDFS/downFile";
	/**
	 * 证联开户行行名
	 */
	public static String ZL_BANK_NAME = "证联支付";
	/**
	 * 证联联行号
	 */
	public static String ZL_CONTACT_BANK_NO = "991585000333";
	/**
	 * 区块链回调内部系统地址
	 */
	public static String BLOCK_CHAIN_CALL_BACK_URL_FLAG = "B00000000_NOTICE_ADDRESS";
	/**
	 * 银企直联签约银行卡查询接口
	 */
	public static String URI_INTF_IEBS_CUST_BANK_CARD_SEARCH = "/post/query/queryBankCardListPage";
	/**
	 * 访问云码通证--查询云码签发信息
	 */
	public static String CREDIT_CLOUD_INFO = "querySigInfo";
	/**
	 * 银企直联签约银行卡签约
	 */
	public static String URI_INTF_IEBS_CUST_BANK_CARD_SIGN = "/post/manage/addBankCard";
	/**
	 * 访问云码通证--查询云码持有人信息
	 */
	public static String CREDIT_CLOUD_OWNERS = "queryHoldInfo";
	/**
	 * 银企直联签约银行卡解约
	 */
	public static String URI_INTF_IEBS_CUST_BANK_CARD_UNSIGN = "/post/manage/rescissionBankCard";
	/**
	 * 访问云码通证--查询云码溯源
	 */
	public static String CREDIT_CLOUD_ROOTS = "queryTraceSource";
	/**
	 * 银企直联签约银行卡审核
	 */
	public static String URI_INTF_IEBS_CUST_BANK_CARD_AUDIT = "/post/manage/auditBankCard";
	/**
	 * 银企直联签约余额查询
	 */
	public static String URI_INTF_IEBS_CUST_BANK_BALANCE_SEARCH = "/post/query/queryBalance";
	/**
	 * 银企直联订单查询
	 */
	public static String URI_INTF_IEBS_ORDER_SEARCH = "/post/query/queryOrderListPage";
	/**
	 * 银企直联订单转账
	 */
	public static String URI_INTF_IEBS_ORDER_TRANSFER = "/post/trade/transfer";
	/**
	 * 银企直联订单审核
	 */
	public static String URI_INTF_IEBS_ORDER_AUDIT = "/post/trade/auditTransfer";
	/**
	 * 银企直联常用收款银行卡查询
	 */
	public static String URI_INTF_IEBS_REC_CARD_SEARCH = "/post/query/queryRecBankCardListPage";
	/**
	 * 银企直联常用收款银行卡添加
	 */
	public static String URI_INTF_IEBS_REC_CARD_ADD = "/post/manage/addRecBankCard";
	/**
	 * 银企直联常用收款银行卡删除
	 */
	public static String URI_INTF_IEBS_REC_CARD_DEL = "/post/manage/deleteRecBankCard";
	/**
	 * 银企直联常用收款银行卡修改
	 */
	public static String URI_INTF_IEBS_REC_CARD_MODIFY = "/post/manage/updateRecBankCard";
	/**
	 * 区块链资金注入上链接口地址
	 */
	public static String URI_BLOCK_CHAIN_PV_INJECT = "/post/pay/rechargeAccount";
	/**
	 * 报表默认页面大小
	 */
	public static int REPORT_SIZE = 2;
	/**
	 * 报表默认币种
	 */
	public static String REPORT_CURRENCY = "人民币";
	/**
	 * 报表生成成功返回固定值，不在生成对账单
	 */
	public static String REPORT_SUCCESS = "19700101000000";
	
}
