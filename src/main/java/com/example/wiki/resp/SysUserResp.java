package com.example.wiki.resp;

public class SysUserResp {
    private Long userid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 身份
     */
    private String identity;
    /**
     * 用户状态:1-正常,2_封禁
     */
    private String userstate;
    /**
     * 备注
     */
    private String remark;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
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
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", identity=").append(identity);
        sb.append(", userstate=").append(userstate);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}