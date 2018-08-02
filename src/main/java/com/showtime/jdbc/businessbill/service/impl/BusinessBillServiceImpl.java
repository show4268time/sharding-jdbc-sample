package com.showtime.jdbc.businessbill.service.impl;


import com.showtime.jdbc.businessbill.domain.BusinessBill;
import com.showtime.jdbc.businessbill.manager.BusinessBillManager;
import com.showtime.jdbc.businessbill.service.BusinessBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Created by zhouzhiliang on 2018/1/3.
 */
@Service("businessBillSer")
public class BusinessBillServiceImpl implements BusinessBillService {

    @Resource
    private BusinessBillManager businessBillManager;

    @Override
    public BusinessBill findById(Long id) {
        return businessBillManager.findById(id);
    }

    @Override
    public List<BusinessBill> findByCondition(BusinessBill query) {
        return businessBillManager.findByCondition(query);
    }

    @Override
    public int insert(BusinessBill businessBill) {

        businessBill.setStatus(0);
        businessBill.setIsDelete(0);
        businessBill.setCreateTime(new Date());
        businessBill.setCreateUser("SYSTEM");



        return businessBillManager.insert(businessBill);
    }

    @Override
    public int updateById(BusinessBill businessBill) {
        businessBill.setUpdateTime(new Date());
        return businessBillManager.updateById(businessBill);
    }
}
