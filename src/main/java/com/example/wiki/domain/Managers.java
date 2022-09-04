package com.example.wiki.domain;

public class Managers {
    private Long managbrid;

    private String managernahe;

    private String duty;

    private String remark;

    public Long getManagbrid() {
        return managbrid;
    }

    public void setManagbrid(Long managbrid) {
        this.managbrid = managbrid;
    }

    public String getManagernahe() {
        return managernahe;
    }

    public void setManagernahe(String managernahe) {
        this.managernahe = managernahe;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
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
        sb.append(", managbrid=").append(managbrid);
        sb.append(", managernahe=").append(managernahe);
        sb.append(", duty=").append(duty);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}