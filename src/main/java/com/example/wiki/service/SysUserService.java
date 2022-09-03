package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.SysUser;
import com.example.wiki.domain.SysUserExample;
import com.example.wiki.domain.TestDaomain;
import com.example.wiki.mapper.SysUserMapper;
import com.example.wiki.mapper.TestMapper;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.SysUserResp;
import com.example.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    public List<SysUserResp> list(){
        List<SysUser> ebookList = sysUserMapper.selectByExample(null);
        List<SysUserResp> list = CopyUtil.copyList(ebookList,SysUserResp.class);
        return list;
    }
}
