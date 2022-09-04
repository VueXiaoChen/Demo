package com.example.wiki.domain;

import java.math.BigDecimal;

public class ExamPaper {
    private Long papbreid;

    private Long examid;

    private Long courseid;

    private Long publisherid;

    private String papercode;

    private Integer duration;

    private BigDecimal totalscore;

    private Short submitstatb;

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