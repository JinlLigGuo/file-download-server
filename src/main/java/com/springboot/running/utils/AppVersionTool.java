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
* @Title: AppVersionTool.java 
* @Package com.springboot.running.utils 
* @Description: TODO(用一句话描述该文件做什么) 
* @author liguo.jin
* @date 2018年5月19日 下午5:06:11 
* @version V1.0   
*/
package com.springboot.running.utils;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.springboot.running.utils.core.HttpClientUtil;

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
* @ClassName: AppVersionTool 
* @Description: app版本更新校验 
* @author liguo.jin
* @date 2018年5月19日 下午5:06:11 
*  
*/
public class AppVersionTool {
	
	//app版本更新校验地址
	public static final String APP_VERSION_INFO = "http://itunes.apple.com/lookup?id=[appId]&country=[country]";
	
	public static final String THREE_LEVEL_TAG = "results";
	
	/**
	 * @throws Exception 
	* @Title: AppVersion 
	* @Description: 检测app是否有版本更新
	* @param @return    
	* @return boolean    返回类型 
	* @throws
	 */
	public static boolean AppVersion(String appId, String country ,String appVersion) {
		try {
			String url = APP_VERSION_INFO.replace("[appId]", appId.toString()).replace("[country]", country);
			
			String result = HttpClientUtil.requestWithParamAndHeader(url, 0, 10*1000, false, null);
			if(StringUtils.isEmpty(result))
				return false;
			
			JSONArray obj = JSONObject.parseObject(result).getJSONArray(THREE_LEVEL_TAG);
			if(null == obj || obj.size() == 0)
				return false;
			
			String version = ((JSONObject)obj.get(0)).get("version").toString();
			if(StringUtils.isEmpty(version))
				return false;
			
			if(version.equals(appVersion))
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	} 
	

	public static void main(String[] args)  {
		AppVersionTool.AppVersion("928929644","cn" ,"");
	}
	 
}
