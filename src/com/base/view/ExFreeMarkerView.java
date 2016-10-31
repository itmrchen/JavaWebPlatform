package com.base.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

/**
 * @author itmrchen
 * @version 1.0.0
 * @description 扩展FreeMarkerView
 * @createDate: 2016年10月31日
 */
public class ExFreeMarkerView extends FreeMarkerView {

    private static final String CONTEXT_PATH = "base";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {

        model.put(CONTEXT_PATH, request.getContextPath());
        super.exposeHelpers(model, request);
    }
}
