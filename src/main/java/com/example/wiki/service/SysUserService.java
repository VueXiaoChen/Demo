package com.example.wiki.service;

import com.example.wiki.domain.SysUser;
import com.example.wiki.domain.SysUserExample;
import com.example.wiki.domain.TestDaomain;
import com.example.wiki.mapper.SysUserMapper;
import com.example.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    public List<SysUser> list(){
        return sysUserMapper.selectByExample(null);
    }
}
