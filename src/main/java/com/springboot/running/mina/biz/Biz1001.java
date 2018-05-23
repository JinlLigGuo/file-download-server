package com.springboot.running.mina.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.springboot.running.mina.cmd.Cmd1001;
import com.springboot.running.mina.comm.RespCodeConstants;
import com.springboot.running.mina.core.AbstractBiz;
import com.springboot.running.service.impl.AppVersionServiceImpl;

/**
 * @author: xiaojian
 * @date: 16-7-5
 * @time: 下午2:33
 * @version: V1.0
 */
@Configurable("appVersionServiceImpl")
public class Biz1001 extends AbstractBiz {
	
	@Autowired
	private AppVersionServiceImpl appVersionServiceImpl;

    private static Logger log = LoggerFactory.getLogger(Biz1001.class);

    @Override
    protected void exec() throws Exception {
        Cmd1001 cmd1001 = (Cmd1001) command;

        log.debug("ip = " + cmd1001.getReqMsg().getIp());
        log.debug("检测版本更新："+ appVersionServiceImpl.AppVersion("928929644","cn" ,""));

        cmd1001.getRespMsg().setRespCode(RespCodeConstants.SUCCESS);
        session.write(cmd1001);
    }

}
