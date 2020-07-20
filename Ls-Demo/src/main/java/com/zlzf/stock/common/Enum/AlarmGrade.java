package com.zlzf.stock.common.Enum;
/**
 * @Description: 
 * @author: liushuang
 * @date:2020年6月2日 下午2:41:03
 */

import java.util.HashMap;
import java.util.Map;

public enum AlarmGrade {
	NONEED("0","无需计费"),
	BEFORE("1","事先计费"),
	AFTER("2","事后计费"),
	AA("3","小刘的测试");
	
	private String value;
	private final String displayName;
	
	private static Map<String, AlarmGrade> valueMap = new HashMap<String, AlarmGrade>();
	
	static {
		for(AlarmGrade _enum : AlarmGrade.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	private AlarmGrade(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @Description:  通过值 找到类对象
	 * @param value
	 * @return
	 * AlarmGrade
	 * @author: liushuang
	 * @date:2020年6月2日 下午3:51:58
	 */
	public AlarmGrade getEnum(String value) {
		return valueMap.get(value);
	}
	
	public static Map<String, AlarmGrade> getValueMap() {
		return valueMap;
	}
	
	public String toString() {
		return this.getDisplayName();
	}
	
	
	/**
	 * @Description: 枚举值转换
	 * @param args
	 * void
	 * @author: liushuang
	 * @date:2020年6月2日 下午3:58:21
	 */
	public static AlarmGrade parseOf(String value) {
		for (AlarmGrade alarmGrade : values()) 
			if (alarmGrade.getValue().equals(value)) 
				return alarmGrade;
			
			throw new IllegalArgumentException("计费方式["+value+"]不匹配!");
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	
}
