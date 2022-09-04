package com.example.wiki.domain;

public class SysRoles {
    private Long roleid;

    private String rolenahe;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolenahe() {
        return rolenahe;
    }

    public void setRolenahe(String rolenahe) {
        this.rolenahe = rolenahe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", rolenahe=").append(rolenahe);
        sb.append("]");
        return sb.toString();
    }
}