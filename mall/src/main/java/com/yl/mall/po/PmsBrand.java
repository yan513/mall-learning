package com.yl.mall.po;

public class PmsBrand {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 首字母
     *
     * @mbg.generated
     */
    private String firstLetter;

    /**
     * 是否为品牌制造商:0->不是 1->是
     *
     * @mbg.generated
     */
    private Boolean factoryStatus;

    /**
     * 产品数量
     *
     * @mbg.generated
     */
    private Long productCount;

    /**
     * 产品评论数量
     *
     * @mbg.generated
     */
    private Long productCommentCount;

    private Integer showStatus;

    /**
     * 品牌logo
     *
     * @mbg.generated
     */
    private String logo;

    /**
     * 专区大图
     *
     * @mbg.generated
     */
    private String bigPic;

    /**
     * 品牌故事
     *
     * @mbg.generated
     */
    private String brandStory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
    }

    public Boolean getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Boolean factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Long productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic == null ? null : bigPic.trim();
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory == null ? null : brandStory.trim();
    }
}