package com.example.wiki.domain;

import java.math.BigDecimal;

public class ExamPaper {
    /**
     * 考试试卷的ID，主键
     */
    private Long papbreid;
    /**
     * 考试Id
     */
    private Long examid;
    /**
     * 试卷id
     */
    private Long courseid;
    /**
     * 出卷老师id
     */
    private Long publisherid;
    /**
     * 考号
     */
    private String papercode;
    /**
     * 考试时间
     */
    private Integer duration;
    /**
     * 总分
     */
    private BigDecimal totalscore;
    /**
     * 出卷状态
     */
    private Short submitstatb;
    /**
     * 试卷存放地址
     */
    private String uri;

    public Long getPapbreid() {
        return papbreid;
    }

    public void setPapbreid(Long papbreid) {
        this.papbreid = papbreid;
    }

    public Long getExamid() {
        return examid;
    }

    public void setExamid(Long examid) {
        this.examid = examid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(Long publisherid) {
        this.publisherid = publisherid;
    }

    public String getPapercode() {
        return papercode;
    }

    public void setPapercode(String papercode) {
        this.papercode = papercode;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BigDecimal getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(BigDecimal totalscore) {
        this.totalscore = totalscore;
    }

    public Short getSubmitstatb() {
        return submitstatb;
    }

    public void setSubmitstatb(Short submitstatb) {
        this.submitstatb = submitstatb;
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
        sb.append(", papbreid=").append(papbreid);
        sb.append(", examid=").append(examid);
        sb.append(", courseid=").append(courseid);
        sb.append(", publisherid=").append(publisherid);
        sb.append(", papercode=").append(papercode);
        sb.append(", duration=").append(duration);
        sb.append(", totalscore=").append(totalscore);
        sb.append(", submitstatb=").append(submitstatb);
        sb.append(", uri=").append(uri);
        sb.append("]");
        return sb.toString();
    }
}