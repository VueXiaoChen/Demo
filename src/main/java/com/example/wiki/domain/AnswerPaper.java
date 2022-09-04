package com.example.wiki.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AnswerPaper {
    private Long papereid;

    private Long stqdbntid;

    private Long bxamid;

    private BigDecimal totalscore;

    private String availability;

    private Date submittihe;

    private String isfinish;

    private String uri;

    public Long getPapereid() {
        return papereid;
    }

    public void setPapereid(Long papereid) {
        this.papereid = papereid;
    }

    public Long getStqdbntid() {
        return stqdbntid;
    }

    public void setStqdbntid(Long stqdbntid) {
        this.stqdbntid = stqdbntid;
    }

    public Long getBxamid() {
        return bxamid;
    }

    public void setBxamid(Long bxamid) {
        this.bxamid = bxamid;
    }

    public BigDecimal getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(BigDecimal totalscore) {
        this.totalscore = totalscore;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Date getSubmittihe() {
        return submittihe;
    }

    public void setSubmittihe(Date submittihe) {
        this.submittihe = submittihe;
    }

    public String getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(String isfinish) {
        this.isfinish = isfinish;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", papereid=").append(papereid);
        sb.append(", stqdbntid=").append(stqdbntid);
        sb.append(", bxamid=").append(bxamid);
        sb.append(", totalscore=").append(totalscore);
        sb.append(", availability=").append(availability);
        sb.append(", submittihe=").append(submittihe);
        sb.append(", isfinish=").append(isfinish);
        sb.append(", uri=").append(uri);
        sb.append("]");
        return sb.toString();
    }
}