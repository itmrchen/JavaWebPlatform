package demo.service.demo;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import demo.dao.demo.JeecgUserDao;

/**
 * 
 * <br>
 * <b>功能：</b>JeecgUserService<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
@Service("jeecgUserService")
public class JeecgUserService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(JeecgUserService.class);
	

	

	@Autowired
    private JeecgUserDao<T> dao;

		
	public JeecgUserDao<T> getDao() {
		return dao;
	}

}
