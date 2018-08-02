package com.showtime.jdbc.businessbill.manager;


import com.showtime.jdbc.businessbill.dao.BusinessBillDao;
import com.showtime.jdbc.businessbill.domain.BusinessBill;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhouzhiliang on 2018/1/3.
 */
@Component
public class BusinessBillManager {

    @Resource
    private BusinessBillDao businessBillDao;

    /**
     * 添加接数表
     * @param  e 回复接数表实体
     * @return 返回添加的接数表的ID
     */
    public int insert(BusinessBill e){
        return businessBillDao.insert(e);
    }

    /**
     * 更新接数表
     * @param  e 更新接数表实体
     * @return 返回更新的接数表的ID
     */
    public int updateById(BusinessBill e){
        return businessBillDao.updateById(e);
    }

    /**
     * 根据主键寻找数据
     * @param id
     * @return
     */
    public BusinessBill findById(Long id){
        return businessBillDao.findById(id);
    }

    /**
     * 根据传入条件查找单据列表
     * @param query
     * @return
     */
    public List<BusinessBill> findByCondition(BusinessBill query){
        return businessBillDao.findByCondition(query);
    }

}
