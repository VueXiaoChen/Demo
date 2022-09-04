package com.example.wiki.domain;

public class SysResource {
    private Long resourceid;
    /**
     * 资源名称
     */
    private String resourcename;
    /**
     * 资源地址
     */
    private String resourceurl;

    public Long getResourceid() {
        return resourceid;
    }

    public void setResourceid(Long resourceid) {
        this.resourceid = resourceid;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceid=").append(resourceid);
        sb.append(", resourcename=").append(resourcename);
        sb.append(", resourceurl=").append(resourceurl);
        sb.append("]");
        return sb.toString();
    }
}