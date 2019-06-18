package com.tj.urbanplanning.tree.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tj.urbanplanning.tree.Util.*;

@Api(tags = "weatherUpload")
@Controller
@RequestMapping("/httpReq")
public class HttpController {

    private TimerUtil timerUtil;

    @RequestMapping(value = "/openTimer", method = RequestMethod.POST)
    @ApiOperation("开启发送天气数据的接口")
    @ResponseBody
    public Boolean openTimer(@RequestBody int period){
        try {
            //匿名方法
            Runnable runnable = () -> {
                HttpUtil httpUtil = new HttpUtil();
                String result = httpUtil.getWeather();
                String dir = result.split(",")[0], speed = result.split(",")[1];
                System.out.println(dir+", "+speed);
//                httpUtil.sendWind(speed, dir);
            };
            final long time = 5;//延迟执行实际：秒
            timerUtil = new TimerUtil();
            timerUtil.scheduleAtFixedRate(runnable,time,period);
            System.out.println("模拟调用数据监控接口已开启！模拟数据变化频率："+period+"秒");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("调用接口失败");
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/shutdownTimer", method = RequestMethod.POST)
    @ApiOperation("关闭发送天气数据的接口")
    @ResponseBody
    public Boolean shutdownTimer(){
        try {
            timerUtil.shutdown();
            System.out.println("模拟调用数据监控接口已关闭");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("调用接口失败");
            return false;
        }
        return true;
    }
}