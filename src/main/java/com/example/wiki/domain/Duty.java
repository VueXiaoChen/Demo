package com.example.wiki.domain;

public class Duty {
    private Long dutyid;

    private String dutyname;

    private String remark;

    public Long getDutyid() {
        return dutyid;
    }

    public void setDutyid(Long dutyid) {
        this.dutyid = dutyid;
    }

    public String getDutyname() {
        return dutyname;
    }

    public void setDutyname(String dutyname) {
        this.dutyname = dutyname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dutyid=").append(dutyid);
        sb.append(", dutyname=").append(dutyname);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}