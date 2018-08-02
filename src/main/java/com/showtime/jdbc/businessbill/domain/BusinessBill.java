package com.showtime.jdbc.businessbill.domain;

import java.util.Date;
import java.util.List;


/**
 * Created with IntelliJ IDEA
 *
 * @description: 分库分表测试主数据
 * @author: yaoweihao
 * @date: 2018/8/1
 * @time: 9:39
 * @modified by:
 */
public class BusinessBill {

    /**
     * 自增id
     */
    private Long id;
    /**
     * 来源系统编码
     */
    private String systemSource;
    /**
     * 单据类型编码
     */
    private String orderType;
    /**
     * 交易类型编码
     */
    private String transactionType;

    /**
     * 业务单号
     */
    private String businessNo;

    /**
     * 单据明细
     */
    private String context;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 类型1手功抛出(业务异常)类型， 2 系统异常
     */
    private Integer exceptionType;

    /**
     * 异常原因
     */
    private String exceptionReason;

    /**
     * 1未删除0删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 执行次数
     */
    private Integer executeCount;

    /**
     * worker执行队列
     */
    private Integer queueId;

    /**
     * 队列编号列表
     */
    private List<Integer> queueIds;
    /**
     * 时间戳
     */
    private Date ts;

    /**
     * 异常任务处理处理条数
     */
    private Integer size;

    /**
     * 商家编码
     */
    private String sellerNo;

    public BusinessBill() {
    }

    public BusinessBill(String exceptionReason) {
        this.exceptionType = 0;
        this.exceptionReason = "其它异常:" + exceptionReason;
    }

    public BusinessBill(String exceptionReason, String context) {
        this.exceptionType = 0;
        this.exceptionReason = "其它异常:" + exceptionReason;
        this.context = context;
    }

    public BusinessBill(String systemSource, String orderType, String transactionType, Integer exceptionType, String exceptionReason) {
        this.systemSource = systemSource;
        this.orderType = orderType;
        this.transactionType = transactionType;
        this.exceptionType = exceptionType;
        this.exceptionReason = exceptionReason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getExceptionReason() {
        return exceptionReason;
    }

    public void setExceptionReason(String exceptionReason) {
        this.exceptionReason = exceptionReason;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(Integer executeCount) {
        this.executeCount = executeCount;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public List<Integer> getQueueIds() {
        return queueIds;
    }

    public void setQueueIds(List<Integer> queueIds) {
        this.queueIds = queueIds;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }
}
