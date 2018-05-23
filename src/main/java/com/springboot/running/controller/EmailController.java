/**   
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
* @Title: EmailController.java 
* @Package com.springboot.running.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月22日 上午11:06:59 
* @version V1.0   
*/
package com.springboot.running.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springboot.running.utils.core.EmailUtils;

/** 
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
* @ClassName: EmailController 
* @Description: 邮件测试类
* @author liguo.jin
* @date 2018年5月22日 上午11:06:59 
*  
*/
@RestController
public class EmailController {
	
	  private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

	    @RequestMapping("sendEmail")
	    public String sendEmail() throws JsonProcessingException {
	        boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[]{"804033842@qq.com"}, null, "<h3><a href='http://www.baidu.com'>百度一下，你就知道</a></h3>", null);
	        logger.debug("邮件发送: "+isSend);
	        return "发送邮件:" + isSend;
	    }

}
