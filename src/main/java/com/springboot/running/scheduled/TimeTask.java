package com.springboot.running.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.springboot.running.utils.AppVersionTool;

/**
 * 
* @ClassName: TimeTask 
* @Description: 定时任务 
* @author jinliguo 
* @date 2018年5月4日 下午8:45:39 
*
 */
@Component
@EnableScheduling
public class TimeTask {

	//6毫秒
	//@Scheduled(fixedRate = 6000)
    public void TaskJob() {
        System.out.println("test second annotation style ..."+ new Date());
        System.out.println("===================定时器测试任务=========================");
    }
    
    /**
     * 
    * @Title: appUpdateByTaskJob 
    * @Description: 每天凌晨 检测更新版本
    * @param     
    * @return void    返回类型 
    * @throws
     */
    @Scheduled(cron= "0 0 0 * * ?") 
    public void appUpdateByTaskJob(){
    	//判断版本信息
    	AppVersionTool.AppVersion("928929644","cn" ,"");
    	//更新数据看状态，待更新，请求更新地址
    	
    }

	
}
