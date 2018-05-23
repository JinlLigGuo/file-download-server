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
* @Title: IpkVersionService.java 
* @Package com.springboot.running.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月19日 下午5:00:58 
* @version V1.0   
*/
package com.springboot.running.service;

import org.springframework.stereotype.Service;

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
* @ClassName: IpkVersionService 
* @Description: (这里用一句话描述这个类的作用) 
* @author liguo.jin
* @date 2018年5月19日 下午5:00:58 
*  
*/
public interface AppVersionService {

	/**
	 * 
	* @Title: AppVersion 
	* @Description: 检测版本更新
	* @param @param appId
	* @param @param country
	* @param @param appVersion
	* @param @return    
	* @return boolean    返回类型 
	* @throws
	 */
	boolean AppVersion(String appId, String country ,String appVersion);

}
