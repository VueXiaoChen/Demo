package com.example.wiki.domain;

public class CoursesType {
    private Long coursestypeid;

    private String coursestype;

    public Long getCoursestypeid() {
        return coursestypeid;
    }

    public void setCoursestypeid(Long coursestypeid) {
        this.coursestypeid = coursestypeid;
    }

    public String getCoursestype() {
        return coursestype;
    }

    public void setCoursestype(String coursestype) {
        this.coursestype = coursestype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coursestypeid=").append(coursestypeid);
        sb.append(", coursestype=").append(coursestype);
        sb.append("]");
        return sb.toString();
    }
}