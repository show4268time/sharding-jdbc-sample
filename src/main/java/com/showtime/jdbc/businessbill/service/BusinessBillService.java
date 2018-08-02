package com.showtime.jdbc.businessbill.service;


import com.showtime.jdbc.businessbill.domain.BusinessBill;

import java.util.List;

/**
 * Created by zhouzhiliang on 2018/1/3.
 */
public interface BusinessBillService {

    /**
     * 根据ID查询接数表
     *
     * @param id 接数表ID
     * @return 返回一条接数表
     */
    BusinessBill findById(Long id);

    /**
     * 根据条件查询接数表
     *
     * @param query 查询接数表条件
     * @return 返回查询的集合
     */
    List<BusinessBill> findByCondition(BusinessBill query);

    /**
     * 添加接数表
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
}
