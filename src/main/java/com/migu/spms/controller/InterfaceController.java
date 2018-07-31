package com.migu.spms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.migu.spms.entity.InterfaceDO;
import com.migu.spms.service.InterfaceService;
import com.migu.spms.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：接口Controller<BR>ijkjnknkjn
 * 创建人：<BR>
 * 时间：2018年7月10日
 */
@Controller
public class InterfaceController {

    @Resource
    private InterfaceService interfaceService;

    @RequestMapping("/toAddInterface")
    public String addInterface() {
        return "addInterface";
    }

    @RequestMapping(value = "/addInterface", method = RequestMethod.POST)
    public String addInterface(Model model, InterfaceDO interfaceDO) {
        System.out.println();
        if (interfaceDO != null) {
            interfaceService.saveInterface(interfaceDO);
        }
        return "redirect:/interfaceInfo";
    }

    @RequestMapping(value = "/updateInterface", method = RequestMethod.POST)
    public String updateUser(Model model, InterfaceDO interfaceDO) {
        if (interfaceService.updateInterface(interfaceDO)) {
            interfaceDO = interfaceService.findInterfaceById(interfaceDO.getInterfaceId());
            model.addAttribute("interfaceDO", interfaceDO);
            return "redirect:/interfaceInfo";
        }
        return "error";
    }

    @RequestMapping(value = "/getAllInterface", method = RequestMethod.GET)
    public String getAllInterface(Model model) {
        List<InterfaceDO> interfaceList = interfaceService.findAll();
        model.addAttribute("interfaceList", interfaceList);
        return "interfaceInfo";
    }

    @RequestMapping(value = "/getInterface", method = RequestMethod.GET)
    public String getInterface(int id, Model model) {
        model.addAttribute("interfaceDO", interfaceService.findInterfaceById(id));
        return "editInterface";
    }

    @RequestMapping(value = "/deleteInterface", method = RequestMethod.POST)
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
