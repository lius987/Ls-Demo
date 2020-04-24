package com.zlzf.stock.dao;

import org.apache.ibatis.annotations.Param;

import com.zlzf.stock.model.entity.Order;

public interface OrderDao {
	/**
	 * @Description: 删除交易记录
	 * @param id
	 * @return
	 * int
	 * @author: liushuang
	 * @date:2020年4月24日 下午2:30:11
	 */
    int deleteByPrimaryKey(String id);

    /**
     * @Description: 新增交易记录
     * @param record
     * @return
     * int
     * @author: liushuang
     * @date:2020年4月24日 下午2:30:38
     */
    int insert(Order record);

    /**
     * @Description: 根据条件新增交易记录
     * @param record
     * @return
     * int
     * @author: liushuang
     * @date:2020年4月24日 下午2:31:08
     */
    int insertSelective(Order record);

    /**
     * @Description: 根据id查询交易记录
     * @param id
     * @return
     * Order
     * @author: liushuang
     * @date:2020年4月24日 下午2:31:29
     */
    
    Order findOrderId(String id);

    /**
     * @Description: 
     * @param record
     * @return
     * int
     * @author: liushuang
     * @date:2020年4月24日 下午2:32:27
     */
    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    /**
     * @Description: 查询年总收入  （转账）
     * @param year
     * @param custId
     * @param organizationId
     * @return
     * Order
     * @author: liushuang
     * @date:2020年4月24日 下午2:37:06
     */
    public Order findYearIncomeAmt(@Param("year")String year,
    		@Param("custId") String custId,@Param("organizationId")String organizationId);
    
    /**
     * @Description: 查询年总支出(转账)
     * @param year
     * @param custId
     * @param organizationId
     * @return
     * Order
     * @author: liushuang
     * @date:2020年4月24日 下午2:38:47
     */
    public Order findYearPayAmt(@Param("year")String year,
    			@Param("custId")String custId,@Param("organizationId")String organizationId);
}