package com.example.wiki.domain;

public class Courses {
    private Long courseid;

    private String coursename;

    private String coursestype;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
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
        sb.append(", courseid=").append(courseid);
        sb.append(", coursename=").append(coursename);
        sb.append(", coursestype=").append(coursestype);
        sb.append("]");
        return sb.toString();
    }
}