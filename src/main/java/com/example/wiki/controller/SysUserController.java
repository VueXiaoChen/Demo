package com.example.wiki.controller;


import com.example.wiki.domain.SysUser;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.resp.SysUserResp;
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
    public CommonResp list(){
        CommonResp<List<SysUserResp>> resp = new CommonResp<>();
        List<SysUserResp> list= sysUserService.list();
        resp.setMessage("获取成功");
        resp.setData(list);
        return resp;
    }
}
