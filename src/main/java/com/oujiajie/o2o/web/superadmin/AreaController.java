package com.oujiajie.o2o.web.superadmin;

import com.oujiajie.o2o.entity.Area;
import com.oujiajie.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-19 16:25
 **/

@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> listArea(){
        HashMap<String, Object> modelMap = new HashMap<>();
        List<Area> list = new ArrayList<>();
        try{
            list = areaService.getAreaList();
            modelMap.put("row",list);
            modelMap.put("total",list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }
        return modelMap;
    }
}
