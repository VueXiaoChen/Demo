package com.example.wiki.domain;

public class Students {
    /**
     * 学生Id
     */
    private Long studentid;
    /**
     * 学生姓名
     */
    private String studentname;
    /**
     * 性别
     */
    private Short grade;
    /**
     * 班级名称
     */
    private String classname;

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentid=").append(studentid);
        sb.append(", studentname=").append(studentname);
        sb.append(", grade=").append(grade);
        sb.append(", classname=").append(classname);
        sb.append("]");
        return sb.toString();
    }
}