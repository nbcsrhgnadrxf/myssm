package gc.com.controller;

import gc.com.entity.GcUser;
import gc.com.service.GcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * (GcUser)表控制层
 *
 * @author makejava
 * @since 2019-11-06 15:29:45
 */
@RestController
@RequestMapping("gcUser")
public class GcUserController {
    /**
     * 服务对象
     */
    @Resource
    private GcUserService gcUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public ModelAndView selectOne(Integer id) {

        ModelAndView mv = new ModelAndView();

        GcUser gcUser = this.gcUserService.queryById(1001011);

        System.out.println("User\t" + gcUser);

        mv.addObject("gcUser", gcUser);

        mv.setViewName("test");

        return mv;
    }

}