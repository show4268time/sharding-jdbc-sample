package com.showtime.jdbc.businessbill.dao;

import com.showtime.jdbc.businessbill.domain.BusinessBill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 分库分表测试DAO
 * @author: yaoweihao
 * @date: 2018/8/1
 * @time: 9:39
 * @modified by:
 */
@Component
public interface BusinessBillDao {

    /**
     * 添加接数表实体
     *
     * @param t 回复接数表实体
     * @return 返回添加的接数表的ID
     */
    int insert(BusinessBill t);

    /**
     * 更新接数表
     *
     * @param t 更新接数表实体
     * @return 返回更新的接数表的ID
     */
    int updateById(BusinessBill t);


    /**
     * 根据ID查询接数表
     *
     * @param id 接数表ID
     * @return 返回一条接数表
     */

    BusinessBill findById(@Param("id") Long id);


    /**
     * 根据条件查询接数表
     *
     * @param query 查询条件
     * @return 返回查询的集合
     */
    List<BusinessBill> findByCondition(@Param("condition") BusinessBill query);


}
