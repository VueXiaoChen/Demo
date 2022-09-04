package com.example.wiki.domain;

public class SysUserRoles {
    private Long usbrid;

    private Long roleid;

    public Long getUsbrid() {
        return usbrid;
    }

    public void setUsbrid(Long usbrid) {
        this.usbrid = usbrid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usbrid=").append(usbrid);
        sb.append(", roleid=").append(roleid);
        sb.append("]");
        return sb.toString();
    }
}