package com.yl.mall.po;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder {
    /**
     * 订单id
     *
     * @mbg.generated
     */
    private Long id;

    private Long memberId;

    private Long couponId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     * 提交时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 用户帐号
     *
     * @mbg.generated
     */
    private String memberUsername;

    /**
     * 订单总金额
     *
     * @mbg.generated
     */
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     *
     * @mbg.generated
     */
    private BigDecimal payAmount;

    /**
     * 运费金额
     *
     * @mbg.generated
     */
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     *
     * @mbg.generated
     */
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     *
     * @mbg.generated
     */
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     *
     * @mbg.generated
     */
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     *
     * @mbg.generated
     */
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     *
     * @mbg.generated
     */
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     *
     * @mbg.generated
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     *
     * @mbg.generated
     */
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     *
     * @mbg.generated
     */
    private String deliveryCompany;

    /**
     * 物流单号
     *
     * @mbg.generated
     */
    private String deliverySn;

    /**
     * 自动确认时间（天）
     *
     * @mbg.generated
     */
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     *
     * @mbg.generated
     */
    private Integer integration;

    /**
     * 可以活动的成长值
     *
     * @mbg.generated
     */
    private Integer growth;

    /**
     * 活动信息
     *
     * @mbg.generated
     */
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     *
     * @mbg.generated
     */
    private Integer billType;

    /**
     * 发票抬头
     *
     * @mbg.generated
     */
    private String billHeader;

    /**
     * 发票内容
     *
     * @mbg.generated
     */
    private String billContent;

    /**
     * 收票人电话
     *
     * @mbg.generated
     */
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     *
     * @mbg.generated
     */
    private String billReceiverEmail;

    /**
     * 收货人姓名
     *
     * @mbg.generated
     */
    private String receiverName;

    /**
     * 收货人电话
     *
     * @mbg.generated
     */
    private String receiverPhone;

    /**
     * 收货人邮编
     *
     * @mbg.generated
     */
    private String receiverPostCode;

    /**
     * 省份/直辖市
     *
     * @mbg.generated
     */
    private String receiverProvince;

    /**
     * 城市
     *
     * @mbg.generated
     */
    private String receiverCity;

    /**
     * 区
     *
     * @mbg.generated
     */
    private String receiverRegion;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    private String receiverDetailAddress;

    /**
     * 订单备注
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     *
     * @mbg.generated
     */
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     *
     * @mbg.generated
     */
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     *
     * @mbg.generated
     */
    private Integer useIntegration;

    /**
     * 支付时间
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     * 发货时间
     *
     * @mbg.generated
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     *
     * @mbg.generated
     */
    private Date receiveTime;

    /**
     * 评价时间
     *
     * @mbg.generated
     */
    private Date commentTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader == null ? null : billHeader.trim();
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent == null ? null : billContent.trim();
    }

    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone == null ? null : billReceiverPhone.trim();
    }

    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail == null ? null : billReceiverEmail.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode == null ? null : receiverPostCode.trim();
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion == null ? null : receiverRegion.trim();
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress == null ? null : receiverDetailAddress.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}