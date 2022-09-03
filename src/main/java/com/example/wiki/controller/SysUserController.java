package com.example.wiki.controller;


import com.example.wiki.domain.SysUser;
import com.example.wiki.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/list")
    public List<SysUser> list(){
        return sysUserService.list();
    }
}
