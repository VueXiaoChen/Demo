package com.example.wiki.domain;

import java.util.Date;

public class Exam {
    private Long examid;
    /**
     * 考试开始时间
     */
    private Date startdate;
    /**
     * 考试结束时间
     */

    private Date enddate;
    /**
     * 课程ID
     */
    private Long courseid;
    /**
     * 出卷老师ID
     */
    private Long publisherid;
    /**
     * 学期
     */
    private String term;

    public Long getExamid() {
        return examid;
    }

    public void setExamid(Long examid) {
        this.examid = examid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examid=").append(examid);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", courseid=").append(courseid);
        sb.append(", publisherid=").append(publisherid);
        sb.append(", term=").append(term);
        sb.append("]");
        return sb.toString();
    }
}