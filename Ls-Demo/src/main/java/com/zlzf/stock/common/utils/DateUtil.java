package com.zlzf.stock.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class DateUtil {

	private DateUtil() {
	
	};

	public static int getDifferDays(String startDate,String endDate) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return (int) ((format.parse(endDate).getTime() - format.parse(startDate).getTime()) / (24 * 60 * 60 * 1000));
	}
	/**
	 * 获取当前日期字符串，格式为yyyyMMdd
	 * 
	 * @return String
	 */
	public static String getCurrentDate() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	public static String getCurrentDate10() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	public static String setDate8to10(String date) {
		if (date.length() == 8){
			return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6);
		}
		else{
			return date;
		}
	}

	/**
	 * 获取当前时间字符串，格式为HHmmss
	 * 
	 * @return String
	 */
	public static String getCurrentTime() {
		return new SimpleDateFormat("HHmmss").format(new Date());
	}

	public static String getCurrentDateTime(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}

	/**
	 * 获取当前的毫秒时间，为long值
	 * 
	 * @return long
	 */
	public static long getCurrentLongTime() {
		return System.currentTimeMillis();
	}

	/**
	 * 获取当前时间的字符串，格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @return String
	 */
	public static String getCurrentPrettyDateTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	/**
	 * 获取当前时间的字符串，格式为yyyy
	 * 
	 * @return String
	 */
	public static String getCurrentPrettyYear() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}
	
	/**
	 * 获取当前时间的字符串，格式为yyyyMM
	 * 
	 * @return String
	 */
	public static String getCurrentPrettyMonth() {
		return new SimpleDateFormat("yyyyMM").format(new Date());
	}

	/**
	 * 获取对应Date的日期字符串，格式为yyyyMMdd
	 * 
	 * @param date
	 *            源Date
	 * @return
	 */
	public static String getDate(Date date) {
		return new SimpleDateFormat("yyyyMMdd").format(date);
	}

	/**
	 * 获取对应Date的时间字符串，格式为HHmmss
	 * 
	 * @param date
	 *            源Date
	 * @return String
	 */
	public static String getTime(Date date) {
		return new SimpleDateFormat("HHmmss").format(date);
	}

	/**
	 * 获取对应Date的日期字符串，格式为yyyy-MM-dd
	 * 
	 * @param date
	 *            源Date
	 * @return String
	 */
	public static String getPrettyDate(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	/**
	 * 获取对应Date的字符串，格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 *            源Date
	 * @return String
	 */
	public static String getPrettyDateTime(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}

	/**
	 * 获取Sybase的日期转换函数表达式，用于SQL中，格式是yyyy/MM/dd HH:mm:ss，没办法，Sybase不支持yyyy-MM-dd
	 * HH:mm:ss
	 * 
	 * @param field
	 *            要转换成yyyy/MM/dd HH:mm:ss格式字符串的日期类型字段名
	 * @return String
	 */
	public static String getSybaseConvertSQL(String field) {
		return "(CONVERT(varchar(12), " + field + ", 111) + ' ' + CONVERT(varchar(12), " + field + ", 108))";
	}

	/**
	 * 获取Sybase的日期转换函数表达式，用于SQL中，格式是yyyy/MM/dd HH:mm:ss，没办法，Sybase不支持yyyy-MM-dd
	 * HH:mm:ss
	 * 
	 * @param field
	 *            要转换成yyyy/MM/dd HH:mm:ss格式字符串的日期类型字段名
	 * @return String
	 */
	public static String getSybaseYYYYMMDD(String field) {
		return "(CONVERT(varchar(12), " + field + ", 112))";
	}

	/**
	 * 获取一年的所有日期列表
	 * 
	 * @param year
	 *            年份
	 * @return ArrayList
	 */
	public static List<Date> getAllDates(String year) {
		ArrayList<Date> list = new ArrayList<Date>();
		int intYear;
		try {
			intYear = Integer.parseInt(year);
		} catch (NumberFormatException e) { // 如果不是合法的年份，返回空的列表
			return list;
		}
		intYear = intYear - 1900; // 需要减去1900
		for (int month = 0; month < 12; month++) {
			for (int day = 1; day < 32; day++) {
				@SuppressWarnings("deprecation")
				Date date = new Date(intYear, month, day);
				if (!list.contains(date)) {
					list.add(date);
				}
			}
		}
		Collections.sort(list);
		return list;
	}

	/*
	 * 获取当前日期，格式为XXXX年XX月XX日 星期几
	 */
	public static String getCurrentChnDate() {
		String strDate = new SimpleDateFormat("yyyyMMdd E", Locale.SIMPLIFIED_CHINESE).format(new Date());
		strDate = strDate.substring(0, 4) + "年" + strDate.substring(4, 6) + "月" + strDate.substring(6, 8) + "日" + strDate.substring(8);
		return strDate;
	}

	/*
	 * 将日期转换为格式XXXX年XX月XX日
	 */
	public static String getChnDate(Date date) {
		String strDate = new SimpleDateFormat("yyyyMMdd").format(date);
		strDate = strDate.substring(0, 4) + "年" + strDate.substring(4, 6) + "月" + strDate.substring(6) + "日";
		return strDate;
	}

	/*
	 * 将字符串'yyyyMMdd'日期转换为格式XXXX年XX月XX日
	 */
	public static String getChnDate(String strDate) {
		return strDate.substring(0, 4) + "年" + strDate.substring(4, 6) + "月" + strDate.substring(6) + "日";
	}

	/*
	 * 获取星期几,输入date是yyyyMMdd格式
	 */
	public static String getWeekDateFromString(String date) throws ParseException {
		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat formatE = new SimpleDateFormat("E", Locale.SIMPLIFIED_CHINESE);
		result = formatE.format(sdf.parse(date));
		return result;
	}

	/**
	 * 检查日期字符串是否合法
	 * 
	 * @param dateStr
	 *            日期字符串
	 * @param pattern
	 *            日期格式
	 * @return 布尔
	 */
	@SuppressWarnings("all")
	public static boolean isValidDate(String dateStr, String pattern) {

		if (dateStr == null || dateStr.trim().length() == 0) {
			return true;
		}

		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(pattern);
		df.setLenient(false);
		try {
			Date date = df.parse(dateStr);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * 检查生日字符串是否合法
	 * 
	 * @param dateStr
	 *            生日字符串
	 * @param pattern
	 *            日期格式
	 * @return 布尔
	 */
	@SuppressWarnings("all")
	public static boolean isValidBirthDate(String dateStr, String pattern) {

		if (dateStr == null || dateStr.trim().length() == 0) {
			return true;
		}

		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(pattern);
		df.setLenient(false);
		try {
			Date date = df.parse(dateStr);
			int year = date.getYear();
			if (year < 0 || year > new Date().getYear()) // 如果生日小于1900年或大于当前日，认为错误
			{
				return false;
			}
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	public static String convertExcelDate(String oldDate) throws Exception {
		if (null == oldDate) {
			return null;
		}

		SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;

		int len = oldDate.trim().length();

		String str = oldDate.substring(1, 2);
		// System.out.println("len=" + len + " pos=" + str);

		try {
			if (len == 8 && oldDate.substring(6, 7).equals("-")) // XXXX-X-X
			{
				oldDate = oldDate.substring(0, 5) + "0" + oldDate.substring(5, 7) + "0" + oldDate.substring(7);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 8 && oldDate.indexOf("-") < 0 && oldDate.indexOf("/") < 0) // XXXXXXXX
			{
				// oldDate = oldDate.substring(0, 5) + "0" +
				// oldDate.substring(5, 7) + "0" + oldDate.substring(7);
				return oldDate;
			}
			if (len == 9 && oldDate.substring(6, 7).equals("-")) // XXXX-X-XX
			{
				oldDate = oldDate.substring(0, 5) + "0" + oldDate.substring(5);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 9 && oldDate.substring(7, 8).equals("-")) // XXXX-XX-X
			{
				oldDate = oldDate.substring(0, 8) + "0" + oldDate.substring(8);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 8 && str.charAt(0) == '/') // X/X/XXXX
			{
				oldDate = oldDate.substring(4) + "-0" + oldDate.substring(0, 1) + "-0" + oldDate.substring(2, 3);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 9 && oldDate.substring(1, 2).equals("/")) // X/XX/XXXX
			{
				oldDate = oldDate.substring(5) + "-0" + oldDate.substring(0, 1) + "-" + oldDate.substring(2, 4);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 9 && oldDate.substring(2, 3).equals("/")) // XX/X/XXXX
			{
				oldDate = oldDate.substring(5) + "-" + oldDate.substring(0, 2) + "-0" + oldDate.substring(3, 4);
				date1 = dfDate.parse(oldDate);
			}
			if (len == 10 && oldDate.substring(2, 3).equals("/")) // XX/XX/XXXX
			{
				oldDate = oldDate.substring(6) + "-" + oldDate.substring(0, 2) + "-" + oldDate.substring(3, 5);
				date1 = dfDate.parse(oldDate);
			} else if (len == 10) {
				date1 = dfDate.parse(oldDate);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("日期格式错误" + oldDate);
		}

		return new SimpleDateFormat("yyyyMMdd").format(date1);
	}

	/**
	 * 日期格式转换
	 * 
	 * @param dateStr
	 *            原始日期字符串
	 * @param srcPattern
	 *            原始日期格式
	 * @param destPattern
	 *            目标日期格式
	 * @return
	 */
	public static String changeDateFormat(String dateStr, String srcPattern, String destPattern) {
		if (null == dateStr || srcPattern == null || destPattern == null) {
			return "";
		}
		if (dateStr.length() == 0 || srcPattern.length() == 0 || destPattern.length() == 0) {
			return "";
		}

		Date srcDate;
		try {
			srcDate = new SimpleDateFormat(srcPattern).parse(dateStr);
		} catch (ParseException e) {
			return "";
		}

		String destStr;
		try {
			destStr = new SimpleDateFormat(destPattern).format(srcDate);
		} catch (Exception e) {
			return "";
		}

		return destStr;
	}

	/**
	 * 获取当前日期后x个月的日期，格式为yyyyMMdd
	 * 
	 * @param x
	 *            后几个月,x必须大于0,小于13
	 * @return String
	 */
	public static String getMonthAfterCurrentDate(int x) {
		String nowDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String year = nowDate.substring(0, 4);
		String month = nowDate.substring(4, 6);
		String day = nowDate.substring(6);
		String newYear = "";
		String newMonth = "";
		if (Integer.parseInt(month) + x > 12) {
			newMonth = String.valueOf(Integer.parseInt(month) + x - 12);
			if (newMonth.length() == 1) {
				newMonth = "0" + newMonth;
			}
			newYear = String.valueOf(Integer.parseInt(year) + 1);
		} else {
			newMonth = String.valueOf(Integer.parseInt(month) + x);
			if (newMonth.length() == 1) {
				newMonth = "0" + newMonth;
			}
			newYear = year;
		}
		return newYear + newMonth + day;
	}

	/**
	 * 获取某日期前x天的日期，格式为yyyyMMdd
	 * 
	 * @param dateString
	 *            某日期
	 * @param x
	 *            前几天
	 * 
	 * @return Date
	 */
	public static String getPreDate(String dateString, int x) {
		Date date;
		Calendar cal = Calendar.getInstance();
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(dateString);
			cal.setTime(date);
			cal.add(Calendar.DAY_OF_YEAR, x);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
	}
	
	/****
	 * 当前日期的前几天或后几天
	 * @description 
	 * @param dateString
	 * @param x
	 * @return  yyyy-MM-dd
	 * @author lyg
	 * @date 2012-11-22
	 */
	public static String getSomeDate(int x) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, x);
		return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
	}

//	public static void main(String[] args) {
//		System.out.println(RefundAuditStatus.valueOf("WAIT_AUDIT").getName());
//		String aaString="111.23";
//		Double xDouble=Double.parseDouble(aaString);
//		System.out.println(xDouble);
//		Long alLong=(long) (xDouble*100);
//		System.out.println(alLong);
		//System.out.println(UserType.USER.name());
//		String aString="a,b,";
//		System.out.println(aString.split(",")[0]+";;;"+aString.split(",")[1]);
//		System.out.println(BankType.BANKTYPE_ABC.getValue());
//		MspResource mr=new MspResouce();
//		mr.setDescription("1");
//		mr.setToken("1111");
//		mr.setUrl("0");
//		
//		
//		MspResource mr1=new MspResource();
//		mr1.setDescription("2");
//		mr1.setToken("222");
//		mr1.setUrl("1");
//		
//		
//		MspResource mr2=new MspResource();
//		mr2.setDescription("3");
//		mr2.setToken("333");
//		mr2.setUrl("1");
//		
//		
//		MspResource mr3=new MspResource();
//		mr3.setDescription("4");
//		mr3.setToken("444");
//		mr3.setUrl("0");
//		
//		
//		MspResource mr4=new MspResource();
//		mr4.setDescription("5");
//		mr4.setToken("555");
//		mr4.setUrl("4");
//		
//		MspResource mr5=new MspResource();
//		mr5.setDescription("6");
//		mr5.setToken("666");
//		mr5.setUrl("4");
//		
//		MspResource mr6=new MspResource();
//		mr6.setDescription("7");
//		mr6.setToken("777");
//		mr6.setUrl("4");
//		
//		
//		List<MspResource> mspResources=new ArrayList<MspResource>();
//		mspResources.add(mr);
//		mspResources.add(mr1);
//		mspResources.add(mr2);
//		mspResources.add(mr3);
//		mspResources.add(mr4);
//		
//		mspResources.add(mr5);
//		mspResources.add(mr6);
//		
//		for (MspResource mres : mspResources) {
//			if (mres.getUrl().equals("0")) {
//				System.out.println(mres.getDescription()+":::");
//				for (MspResource mres1 : mspResources) {
//					if (mres.getDescription().equals(mres1.getUrl())) {
//						System.out.println(mres1.getDescription());
//					}
//				}
//			}
//		}
		
		//System.out.println(CredentialsType.valueOf("CERTTYPE_00").getFaceCode());
//		System.out.println(UserType.USER.name());
//		try {
//			// System.out.println("date=" +
//			// DateUtil.isValidBirthDate("20010101", "yyyyMMdd"));
//			// System.out.println("date=" +
//			// DateUtil.isValidBirthDate("18010101", "yyyyMMdd"));
//			// System.out.println("date=" +
//			// DateUtil.isValidBirthDate("20080101", "yyyyMMdd"));
//			// System.out.println("date=" +
//			// DateUtil.isValidBirthDate("2007-11-30 17:43:07", "yyyy-MM-dd
//			// HH:mm:ss"));
//			// SimpleDateFormat dfTime = new SimpleDateFormat("yyyy-MM-dd
//			// HH:mm:ss");
//			// dfTime.setLenient(false);
//			// Date d = dfTime.parse("2007-12-4 17:44:51");
//			// System.out.println(dfTime.format(d));
//			//System.out.println(getPreDate("20090102", -2));
//			
//			  /*SimpleDateFormat fm = new SimpleDateFormat("MMM d yyyy hh:mma", Locale.US);
//			    fm.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//			    Date date = new Date();
//			    System.out.println(date);
//			    System.out.println(fm.format(date));
//			    
//
//			    String zone = System.getProperty("user.timezone");   
//			    System.out.println(zone);*/
//			System.out.println(DateUtil.getCurrDateTime());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	/**
	 * 字符串转换到时间格式
	 * 
	 * @param dateStr
	 *            需要转换的字符串
	 * @param formatStr
	 *            需要格式的目标字符串 举例 yyyy-MM-dd,yyyyMMddhhmmss
	 * @return Date 返回转换后的时间
	 * @throws ParseException
	 *             转换异常
	 */
	public static Date strToDate(String dateStr, String formatStr) {
		if (dateStr == null){
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date strToPrettyDate(String dateStr) throws ParseException{
		if (dateStr == null){
			return null;
		}
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(dateStr);
		return date;
	}
	
	/**
	 * 字符串转换到时间格式 默认yyyyMMddhhmmss
	 * 
	 * @return Date 返回转换后的时间
	 * @throws ParseException
	 *             转换异常
	 */
	public static Date strToDate(String dateStr) {
		if (dateStr == null){
			return null;
		}
		return strToDate(dateStr, "yyyyMMddHHmmss");
	}

	public static Date strToDate1(String str){
		DateFormat df=new SimpleDateFormat("yyyyMMdd");
		try {
		return df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 时间格式转到字符串 默认yyyy-MM-dd
	 */
	public static String dateToStr(Date date) {

		if (date == null){
			return null;
		}
		return dateToStr(date, null);
	}

	/**
	 * 时间格式转到字符串 默认yyyyMMddhhmmss
	 */
	public static String dateToStr(Date date, String format) {

		if (date == null){
			return null;
		}
		if (format == null){
			format = "yyyy-MM-dd";
		}
		DateFormat sdf = new SimpleDateFormat(format);
		String strDate = null;
		try {
			strDate = sdf.format(date);
		} catch (Exception e) {

		}
		return strDate;
	}
	/***
	 * 判断是否日期格式
	 * @description 
	 * @param dateStr
	 * @param format
	 * @return  
	 * @author lyg
	 * @date 2012-11-22
	 */
	public static boolean isDate(String dateStr, String format) {
		if (dateStr == null){
			return false;
		}
		if (format == null){
			format = "yyyy-MM-dd";
		}
		try {
			DateFormat sdf = new SimpleDateFormat(format);
			sdf.parse(dateStr);
		} catch (Exception e) {
			return false;
		}		
		return true;
	}
	
	/***
	 * 日期格式轉換yyyyMMdd轉yyyy-MM-dd
	 * @param strDate
	 * @return
	 */
	public static String strDate2StrDate(String strDate)
	{
		if(strDate==null||strDate.length()!=8){
			return strDate;
		}
		
		return strDate.substring(0, 4)+"-"+strDate.substring(4, 6)+"-"+strDate.substring(6, 8);
	}
	/***
	 * 日期格式轉換yyyy-MM-dd轉dd/MM/yyyy
	 * @param strDate
	 * @return
	 */
	public static String strDate2StrDate2(String strDate)
	{
		if(strDate==null||strDate.length()!=10){
			return strDate;
		}
		
		return strDate.substring(8, 10)+"/"+strDate.substring(5, 7)+"/"+strDate.substring(0, 4);
	}
	/***
	 * 日期格式轉換yyyyMMdd轉dd/MM/yyyy
	 * @param strDate
	 * @return
	 */
	public static String strDate2StrDate3(String strDate)
	{
		if(strDate==null||strDate.length()!=8){
			return strDate;
		}
		
		return strDate.substring(6, 8)+"/"+strDate.substring(4, 6)+"/"+strDate.substring(0, 4);
	}
	/***
	 * 日期格式轉換dd/MM/yyyy轉yyyyMMdd
	 * @param strDate
	 * @return
	 */
	public static String strDate2StrDate4(String strDate)
	{
		if(strDate==null||strDate.length()!=10){
			return strDate;
		}
		String[] strParts=strDate.split("/");
		if(strParts.length!=3){
			return strDate;
		}
		return strParts[2]+strParts[1]+strParts[0];
	}
	/***
	 * 時間格式轉換hhmmss轉HH:mm:ss
	 * @param strDate
	 * @return
	 */
	public static String strTime2StrTime(String strDate)
	{
		if(strDate==null||strDate.length()!=6){
			return strDate;
		}
		
		return strDate.substring(0, 2)+":"+strDate.substring(2, 4)+":"+strDate.substring(4, 6);
	}
	/***
	 * 時間間隔
	 * @param strDate hhmmss
	 * @return HH:mm:ss
	 */
	public static String rangeTime(String strDate)
	{
		if(strDate==null||strDate.length()!=6)
		{
			return strDate;
		}		
		 SimpleDateFormat d = new SimpleDateFormat("HHmmss");
		 String nowtime = d.format(new Date());
		 int ss1=Integer.valueOf(strDate.substring(0, 2))*3600+Integer.valueOf(strDate.substring(2, 4))*60+Integer.valueOf(strDate.substring(4, 6));
		 int ss2=Integer.valueOf(nowtime.substring(0, 2))*3600+Integer.valueOf(nowtime.substring(2, 4))*60+Integer.valueOf(nowtime.substring(4, 6));
		 ss1=ss2-ss1;
		 ss1=ss1<0?-ss1:ss1;
		 int h=ss1/3600;
		 int m=ss1%3600/60;
		 int s=ss1%60;
		 return String.format("%02d", h)+":"+String.format("%02d", m)+":"+String.format("%02d", s);
	}
	//日期加天数
	public static Date dateAddDay(Date date,int day)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, day);
		return calendar.getTime();
	}
	
	/***
	 * 以日期作為流水號yyyyMMddhhmmss+兩位隨機數
	 */
	public static String getOrderNo()
	{
		String str1=dateToStr(new Date(),"yyyyMMddHHmmss");
		String str2=String.format("%02d",System.currentTimeMillis()%100);
		return str1+str2;
	}
	
	/***返回format,當前日期加天數***/
	public static String currDateAddDay(int day,String format)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, day);
		Date afterDate=calendar.getTime();
		return dateToStr(afterDate,format);
	}
	
	/**
	 * 获取當前的字符串，格式为dd/MM/yyyy HH:mm:ss
	 * 
	 * @param date
	 *            源Date
	 * @return String
	 */
	public static String getCurrentDateTimeByMOType() {
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
	}
	/**
	 * 获取当前日期字符串，格式为dd/MM/yyyy
	 * 
	 * @return String
	 */
	public static String setDateFormatByMOType(String date) {
		if (date.length() == 8){
			return date.substring(6) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4);
		}
		else{
			return date;
		}
	}
	/***
	 * hhmmss
	 */
	public static String getCurrTimeStr()
	{
		return new SimpleDateFormat("hhmmss").format(new Date());
	}
	/*****
	 * yyyyMMddhhmmss
	 * @description 
	 * @return  
	 * @author lyg
	 * @date 2012-11-19
	 */
	public static String getCurrDateTimeStr()
	{
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}
	public static String getCurrDateTime(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	public static String getDateYear(String dateStr){
		return dateStr.split("-")[0];
	}
	
	public static String getDateMonth(String dateStr){
		return dateStr.split("-")[1];
	}
	
	public static String getDateDay(String dateStr){
		return dateStr.split("-")[2];
	}
	
	public static String getDateYear(Date date){
		return getDateYear(dateToStr(date));
	}
	
	public static String getDateMonth(Date date){
		return getDateMonth(dateToStr(date));
	}
	
	public static String getDateDay(Date date){
		return getDateDay(dateToStr(date));
	}
	
	@SuppressWarnings("all")
	public static Map<Integer, Integer> getMonthAndDaysBetweenDate(String date1,String date2) throws ParseException{
		  Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
		  SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		  Date d1 = sd.parse(date1);
		  Date d2 = sd.parse(date2);
		  
		  int months=0;//相差月份
		  int days=0;
		  int y1=d1.getYear();
		  int y2=d2.getYear();
		  int dm1=d2.getMonth();//起始日期月份
		  int dm2=d2.getMonth();//结束日期月份
		  int dd1=d1.getDate(); //起始日期天
		  int dd2=d2.getDate(); //结束日期天
		  if(d1.getTime() < d2.getTime()){
			   months = d2.getMonth() - d1.getMonth() + (y2-y1) * 12;
			   if(dd2 < dd1){
			      months = months-1;
			   }
			   days = getDaysBetweenDate(getFormatDateTime(addMonthsToDate(parseDate(date1, "yyyy-MM-dd"),months,0),"yyyy-MM-dd"),date2);
			   map.put(1, months);
			   map.put(2, days);
		  }
		  return map;
	 }

	 public  static Date parseDate(String dateString,String dateFormate){
		SimpleDateFormat sd = new SimpleDateFormat(dateFormate);
		Date date;
		try {
			date = sd.parse(dateString);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	 }

	 private static String getFormatDateTime(Date date,String fmt){
		 SimpleDateFormat fmTT = new SimpleDateFormat(fmt);
		 return fmTT.format(date);
	 }
	 
	 public static Date addMonthsToDate(Date date,int months,int days){
		  Calendar c = Calendar.getInstance();
		  c.setTime(date);
		  c.add(Calendar.MONTH,months);
		  c.roll(Calendar.DATE, days);
		  return c.getTime();
	 }
	 
	 public static int getDaysBetweenDate(String date1,String date2) throws ParseException{
		  SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		  Date d1 = sd.parse(date1);
		  Date d2 = sd.parse(date2);
		  Calendar c1 = Calendar.getInstance();
		  c1.setTime(d1);
		  Calendar c2 = Calendar.getInstance();
		  c2.setTime(d2);
		  long diff = (c2.getTimeInMillis()-c1.getTimeInMillis())/(1000*60*60*24);
		  return ((Long)diff).intValue();
	}
		 
	/**
	 * 日期加n天
	 * @param date	
	 * @param n 天数	为负数时代表减|n|天
	 * @return
	 * @author	马颂超
	 * @date	2016年6月29日
	 */
	public static Date dateAdd(Date date,int n){
		Date date2 = new Date();
		Calendar calendar = new GregorianCalendar();
	    calendar.setTime(date); 
	    calendar.add(Calendar.DATE,n);//把日期往后增加n天.整数往后推,负数往前移动 
	    date2 = calendar.getTime();   
		return date2;
	}
	
	/**
	 * 日期+n天
	 * @param date	yyyyMMdd
	 * @param n			天数,可为负数
	 * @return
	 * @author	马颂超
	 * @date	2016年7月1日
	 */
	public static Date dateAdd(String date, int n) {
		Date d = strToDate(date);
		return dateAdd(d,n);
	}
	
	/**
	 * 日期+n天
	 * @param date	yyyyMMdd
	 * @param n			天数,可为负数
	 * @return
	 * @author	马颂超
	 * @date	2016年7月1日
	 */
	public static String dateAdd2(String date, int n) {
		Date d = strToDate(date);
		return dateToStr(dateAdd(d,n));
	}
	
    /**
    * @Description: 获取对应Date的日期字符串，格式为yyyyMMddHHmmss  
    * @param date
    * @return String
    * @author: libingtan
    * @date: 2018年5月8日 下午7:07:57 
    */ 
    public static String getDateTime(Date date) {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(date);
    }

    /**
     * @Title:getTimeDifference()
     * @deprecated:获取两个时间差(返回时间)
     * @param starDate
     * @param endDate
     * @return
     */
    public static long getTimeDiffHour(Date starDate, Date endDate) {
        long diff = endDate.getTime() - starDate.getTime();
        long diffHour = diff / (1000 * 60 * 60);
        return diffHour;
    }
    public static Date getShortDate(String strDate) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd").parse(strDate);
    }
    
    /**
     * 获取本月月初
     * @return yyyyMMdd
     * @throws ParseException
     */
    public static String getFirstDayTimeOfMonth() {
    	Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
        lastDate.set(Calendar.HOUR_OF_DAY, 0);
        lastDate.set(Calendar.MINUTE, 0);
        lastDate.set(Calendar.SECOND, 0);
        return new SimpleDateFormat("yyyyMMdd").format(lastDate.getTime());
    }
    /**
     * 获取上月月初
     * @return yyyyMMdd
     * @throws ParseException
     */
    public static String getPreviousMonthFirst() {
    	Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
        lastDate.add(Calendar.MONTH, -1);// 减一个月，变为下月的1号
        return new SimpleDateFormat("yyyyMMdd").format(lastDate.getTime());
    }
    /**
     * 获取上月月末
     * @return yyyyMMdd
     * @throws ParseException
     */
    public static String getPreviousMonthEnd() {
    	Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.MONTH, -1);// 减一个月
        lastDate.set(Calendar.DATE, 1);// 把日期设置为当月第一天
        lastDate.roll(Calendar.DATE, -1);// 日期回滚一天，也就是本月最后一天
        return new SimpleDateFormat("yyyyMMdd").format(lastDate.getTime());
    }
    
    /**
    * @Description:根据年月获取当月最后一天  
    * @param taskDate （yyyyMM）必须为此格式
    * @return Date
    * @author: libingtan
    * @date: 2020年3月26日 下午3:26:49 
    */ 
    public static Date getLastDayOfMonth(String taskDate) {
    	int year = Integer.parseInt(taskDate.substring(0, 4));
    	int month =  Integer.parseInt(taskDate.substring(4));
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        Date lastDayOfMonth = cal.getTime();
        return lastDayOfMonth;
    }
    
    /**
    * @Description: 获取指定月份第一天  
    * @param taskDate （yyyyMM）必须为此格式
    * @return Date
    * @author: libingtan
    * @date: 2020年3月26日 下午3:31:46 
    */ 
    public static Date getFirstDayOfMonth(String taskDate) {
    	String firstDayOfMonth = taskDate+"01";
    	return strToDate1(firstDayOfMonth);
    }
 
    
}
