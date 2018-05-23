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
* @Title: Biz101.java 
* @Package com.springboot.running.mina.biz 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月22日 下午2:25:04 
* @version V1.0   
*/
package com.springboot.running.mina.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springboot.running.mina.cmd.Cmd101;
import com.springboot.running.mina.comm.RespCodeConstants;
import com.springboot.running.mina.core.AbstractBiz;
import com.springboot.running.service.AppVersionService;

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
* @ClassName: Biz101 
* @Description: 请求app版本是否更新
* @author liguo.jin
* @date 2018年5月22日 下午2:25:04 
*  
*/
public class Biz101 extends AbstractBiz {
	
	  private static Logger log = LoggerFactory.getLogger(Biz101.class);

	    protected void exec() throws Exception {
	        Cmd101 cmd101 = (Cmd101) command;

	        log.debug("ip = " + cmd101.getReqMsg().getIp());

	        cmd101.getRespMsg().setRespCode(RespCodeConstants.SUCCESS);
	        session.write(cmd101);
	        /**检测更新**/
	    }

}
