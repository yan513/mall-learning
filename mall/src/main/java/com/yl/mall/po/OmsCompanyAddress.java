package com.yl.mall.po;

public class OmsCompanyAddress {
    private Long id;

    /**
     * 地址名称
     *
     * @mbg.generated
     */
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     *
     * @mbg.generated
     */
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     *
     * @mbg.generated
     */
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 收货人电话
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 省/直辖市
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 区
     *
     * @mbg.generated
     */
    private String region;

    /**
     * 详细地址
     *
     * @mbg.generated
     */
    private String detailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}