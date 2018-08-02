package com.showtime.jdbc.businessbill.service.impl;


import com.showtime.jdbc.businessbill.domain.BusinessBill;
import com.showtime.jdbc.businessbill.manager.BusinessBillManager;
import com.showtime.jdbc.businessbill.service.BusinessBillService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Created by zhouzhiliang on 2018/1/3.
 */
@Service("businessExceptionBillService")
public class BusinessBillServiceImpl implements BusinessBillService {

    @Resource
    private BusinessBillManager businessBillManager;

    @Value("${exception.bill.task.queue.num}")
    private Integer queueNum;

    @Override
    public BusinessBill findById(Long id) {
        return businessBillManager.findById(id);
    }

    @Override
    public List<BusinessBill> findByCondition(BusinessBill query) {
        return businessBillManager.findByCondition(query);
    }

    @Override
    public int insert(BusinessBill exceptionBill) {

        exceptionBill.setStatus(0);
        exceptionBill.setIsDelete(0);
        exceptionBill.setCreateTime(new Date());
        exceptionBill.setCreateUser("SYSTEM");
        exceptionBill.setExecuteCount(0);
        if(StringUtils.isNotBlank(exceptionBill.getExceptionReason())&&exceptionBill.getExceptionReason().length()>500){
            exceptionBill.setExceptionReason(exceptionBill.getExceptionReason().substring(0,500));
        }


        return businessBillManager.insert(exceptionBill);
    }

    @Override
    public int updateById(BusinessBill exceptionBill) {
        exceptionBill.setUpdateTime(new Date());
        return businessBillManager.updateById(exceptionBill);
    }
}
