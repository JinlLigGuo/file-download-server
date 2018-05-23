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
* @Title: Cmd101.java 
* @Package com.springboot.running.mina.cmd 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月22日 下午2:14:44 
* @version V1.0   
*/
package com.springboot.running.mina.cmd;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springboot.running.mina.cmd.Cmd1001.ReqMsg;
import com.springboot.running.mina.comm.CidConst;
import com.springboot.running.mina.core.AbstractBaseCommand;
import com.springboot.running.mina.core.CommandRespMsg;
import com.springboot.running.mina.utils.GsonUtils;

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
* @ClassName: Cmd101 
* @Description: 请求app版本是否更新 
* @author liguo.jin
* @date 2018年5月22日 下午2:14:44 
*  
*/
public class Cmd101 extends AbstractBaseCommand{

    private static Logger log = LoggerFactory.getLogger(Cmd101.class);

    private ReqMsg reqMsg;
    private CommandRespMsg respMsg = new CommandRespMsg();

    @Override
    public short getCid() {
        return CidConst.C101;
    }

    @Override
    public void bodyFromBytes(byte[] bytes) throws Exception {
        String json = new String(bytes, chartset);
        log.debug("Cmd101服务端接收请求消息：" + json);
        reqMsg = (ReqMsg) GsonUtils.fromJson(json, ReqMsg.class);
    }

    @Override
    public byte[] bodyToBytes() throws Exception {
        String json = GsonUtils.toJson(respMsg);
        log.debug("Cmd101服务端发送响应消息：" + json);
        return json.getBytes(chartset);
    }

    public class ReqMsg implements Serializable {
    	
		private static final long serialVersionUID = 1L;

		private String appid;
    	
    	private String country;
    	
    	private String appVersion;
    	
    	private String ip;

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAppid() {
			return appid;
		}

		public void setAppid(String appid) {
			this.appid = appid;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getAppVersion() {
			return appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}
    	
    }

    public ReqMsg getReqMsg() {
        return reqMsg;
    }

    public CommandRespMsg getRespMsg() {
        return respMsg;
    }
}
