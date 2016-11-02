package demo.service.demo;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import demo.dao.demo.ContentDao;

/**
 * 
 * <br>
 * <b>功能：</b>ContentService<br>
 * <b>作者：</b>www.javazx.com<br>
 * <b>日期：</b> Feb 2, 2016 <br>
 * <b>版权所有：<b>版权所有(C) 2016，www.javazx.com<br>
 */
@Service("contentService")
public class ContentService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(ContentService.class);
	

	

	@Autowired
    private ContentDao<T> dao;

		
	public ContentDao<T> getDao() {
		return dao;
	}

}
