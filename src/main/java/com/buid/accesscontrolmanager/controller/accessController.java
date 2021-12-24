package com.buid.accesscontrolmanager.controller;

import com.buid.accesscontrolmanager.entity.AccessControlDevice;
import com.buid.accesscontrolmanager.service.AccessControlDeviceService;
import com.buid.accesscontrolmanager.util.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class accessController {
    @Resource
    private AccessControlDeviceService service;
    @RequestMapping("/getAll")
    public String see(@RequestParam(value = "ids",required = false,defaultValue = "0") String ids, Model model){
        System.out.println(ids);
        Integer uid=Integer.parseInt(ids);
        System.out.println(uid);
        List<AccessControlDevice> list=service.getAll(uid);
        model.addAttribute("List",list);
        return "see";
    }
}
