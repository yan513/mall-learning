package com.yl.mall.po;

import java.util.Date;

public class CmsMemberReport {
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     *
     * @mbg.generated
     */
    private Integer reportType;

    /**
     * 举报人
     *
     * @mbg.generated
     */
    private String reportMemberName;

    private Date createTime;

    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     *
     * @mbg.generated
     */
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     *
     * @mbg.generated
     */
    private Integer handleStatus;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName == null ? null : reportMemberName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject == null ? null : reportObject.trim();
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}