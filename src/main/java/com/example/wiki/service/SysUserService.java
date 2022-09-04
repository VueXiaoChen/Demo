package com.example.wiki.service;

import com.example.wiki.domain.SysUser;
import com.example.wiki.mapper.SysUserMapper;
import com.example.wiki.req.SysUserReq;
import com.example.wiki.resp.SysUserResp;
import com.example.wiki.util.CopyUtil;
import com.example.wiki.util.SnowFlake;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SnowFlake snowFlake;

    /**
     * 查询所有学生,不分页
     * @return
     */
    public List<SysUserResp> FindUser(){
        List<SysUser> ebookList = sysUserMapper.selectByExample(null);
        List<SysUserResp> list = CopyUtil.copyList(ebookList,SysUserResp.class);
        return list;
    }

    /**
     * 删除 通过id
     * @param userid ID
     */
    public void DeleteUser(long userid){
        sysUserMapper.deleteByPrimaryKey(userid);
    }
    /**
     * 删除 通过实体类
     * @param sysUserResp 实体类
     */
    public void DeleteUserBean(SysUserResp sysUserResp){
        sysUserMapper.deleteByPrimaryKey(sysUserResp.getUserid());
    }

    /**
     * 添加 通过实体类
     * @param sysUserReq 实体类
     */
    public void AddOrUpdateUser(SysUserReq sysUserReq) {
        SysUser sysUser = CopyUtil.copy(sysUserReq, SysUser.class);
        if (ObjectUtils.isEmpty(sysUserReq.getUserid())) {
            sysUser.setUserid(snowFlake.nextId());
            //增加数据
            sysUserMapper.insert(sysUser);
        } else {
            sysUserMapper.updateByPrimaryKey(sysUser);
        }
    }
}
