package com.migu.spms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.migu.spms.entity.InterfaceDO;
import com.migu.spms.service.InterfaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
@Controller
public class InterfaceController {

    @Resource
    private InterfaceService interfaceService;

    @RequestMapping("/toAddInterface")
    public String addInterface() {
        return "addInterface";
    }

    @RequestMapping("/addInterface")
    public String addInterface(Model model, InterfaceDO interfaceDO) {
        if (interfaceDO != null) {
            interfaceService.saveInterface(interfaceDO);
        }
        return "redirect:/interfaceInfo";
    }

    @RequestMapping("/updateInterface")
    public String updateUser(Model model, InterfaceDO interfaceDO) {
        if (interfaceService.updateInterface(interfaceDO)) {
            interfaceDO = interfaceService.findInterfaceById(interfaceDO.getInterfaceId());
            model.addAttribute("interfaceDO", interfaceDO);
            return "redirect:/interfaceInfo";
        }
        return "error";
    }

    @RequestMapping("/getAllInterface")
    public String getAllInterface(Model model) {
        List<InterfaceDO> interfaceList = interfaceService.findAll();
        model.addAttribute("interfaceList", interfaceList);
        return "interfaceInfo";
    }

    @RequestMapping("/getInterface")
    public String getInterface(int id, Model model) {
        model.addAttribute("interfaceDO", interfaceService.findInterfaceById(id));
        return "editInterface";
    }

    @RequestMapping("/deleteInterface")
    public String deleteInterface(int id, Model model) {
        model.addAttribute("interface", interfaceService.deleteInterface(id));
        return "redirect:interfaceInfo";
    }

    @RequestMapping("/interfaceInfo")
    public String getInterfaces(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
        PageHelper.startPage(pn, 5);
        List<InterfaceDO> interfaces = interfaceService.findAll();

        PageInfo page = new PageInfo(interfaces, 5);
        model.addAttribute("pageInfo", page);
        return "interfaceInfo";
    }



}
