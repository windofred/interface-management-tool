package com.migu.spms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.migu.spms.entity.InterfaceDO;
import com.migu.spms.service.InterfaceService;
import com.migu.spms.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sala on 2018/7/8.
 */
@Controller
public class InterfaceController {

    @Resource
    private InterfaceService interfaceService;

    @ResponseBody
    @RequestMapping(value="/interface/{interfaceId}",method=RequestMethod.POST)
    public Msg saveInterface(InterfaceDO interfaceDO, HttpServletRequest request){
        System.out.println("请求体中的值："+request.getParameter("gender"));
        System.out.println("将要更新的员工数据：" + interfaceDO);
        int updateById = interfaceService.updateById(interfaceDO);
        return Msg.success();
    }

    /**
     * 导入jackson包。
     * @param pn
     * @return
     */
    @RequestMapping("/interfaces")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<InterfaceDO> interfaces = interfaceService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(interfaces, 5);
        return Msg.success().add("pageInfo", page);
    }

    /*@ResponseBody
    @RequestMapping(value="/interface/{interfaceId}",method= RequestMethod.PUT)
    public Msg saveEmp(InterfaceDO interfaceDO, HttpServletRequest request){
        System.out.println("请求体中的值："+request.getParameter("gender"));
        System.out.println("将要更新的员工数据："+ interfaceDO);
        interfaceService.insertInterface(interfaceDO);
        return Msg.success();
    }*/

    /**
     * 根据id查询接口
     * @param id
     * @return
     */
    @RequestMapping(value="/interface/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Msg getEmp(@PathVariable("id") Integer id) {
        InterfaceDO interfaceDO = interfaceService.selectById(id);
        return Msg.success().add("interface", interfaceDO);
    }

    /**
     * 接口保存
     * 1、支持JSR303校验
     * 2、导入Hibernate-Validator
     *
     *
     * @return
     */
    @RequestMapping(value="/interface", method=RequestMethod.POST)
    @ResponseBody
    public Msg saveInterface(@Valid InterfaceDO interfaceDO, BindingResult result){
        if(result.hasErrors()){
            //校验失败，应该返回失败，在模态框中显示校验失败的错误信息
            Map<String, Object> map = new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError : errors) {
                System.out.println("错误的字段名："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields", map);
        }else{
            interfaceService.insertInterface(interfaceDO);
            return Msg.success();
        }

    }

}
