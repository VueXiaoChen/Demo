package com.example.wiki.domain;

public class SysRoleResource {
    /**
     * 引用自Sys-Roles表主键，主键
     */
    private Long roleid;
    /**
     * 引用自Sys-Resource表主键，主键
     */

    private Long rbsourcbid;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getRbsourcbid() {
        return rbsourcbid;
    }

    public void setRbsourcbid(Long rbsourcbid) {
        this.rbsourcbid = rbsourcbid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", rbsourcbid=").append(rbsourcbid);
        sb.append("]");
        return sb.toString();
    }
}