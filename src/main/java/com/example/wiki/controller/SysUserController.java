package com.example.wiki.controller;


import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.SysUser;
import com.example.wiki.exception.BusinessException;
import com.example.wiki.exception.BusinessExceptionCode;
import com.example.wiki.req.SysUserReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EbookResp;
import com.example.wiki.resp.PageResp;
import com.example.wiki.resp.SysUserResp;
import com.example.wiki.service.SysUserService;
import com.example.wiki.util.CopyUtil;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @GetMapping("/findall")
    public CommonResp FindUser(){
        CommonResp<List<SysUserResp>> resp = new CommonResp<>();
        List<SysUserResp> list= sysUserService.FindUser();
        resp.setMessage("获取成功");
        resp.setData(list);
        return resp;
    }

    /**
     * 删除
     * @param userid
     * @return
     */
    @DeleteMapping("/delete/{userid}")
    public CommonResp DeleteUser(@PathVariable("userid") long userid){
        CommonResp resp = new CommonResp<>();
        sysUserService.DeleteUser(userid);
        resp.setMessage("删除成功");
        return resp;
    }

    /**
     * 增加
     * @param
     * @return
     */
    @PostMapping("/add")
    public CommonResp AddOrUpdate(@RequestBody SysUserReq sysUserReq){
        CommonResp resp = new CommonResp<>();
        sysUserService.AddOrUpdateUser(sysUserReq);
        resp.setMessage("操作成功");
        resp.setData(sysUserReq);
        return resp;
    }
}
