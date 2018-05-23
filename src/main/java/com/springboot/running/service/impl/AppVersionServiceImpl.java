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
* @Title: IpkVersionServiceImpl.java 
* @Package com.springboot.running.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月19日 下午5:01:43 
* @version V1.0   
*/
package com.springboot.running.service.impl;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.springboot.running.service.AppVersionService;
import com.springboot.running.utils.AppVersionTool;

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
* @ClassName: AppVersionServiceImpl
* @Description: app版本更新 
* @author liguo.jin
* @date 2018年5月19日 下午5:01:43 
*  
*/
@Service
public class AppVersionServiceImpl  implements AppVersionService{

	/**
	 * 检测版本更新
	 */
	@Override
	public boolean AppVersion(String appId, String country, String appVersion) {
		return AppVersionTool.AppVersion(appId, country, appVersion);
	}
	
	
	
	

}
