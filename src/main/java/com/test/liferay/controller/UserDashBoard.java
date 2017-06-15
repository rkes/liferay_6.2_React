package com.test.liferay.controller;


import com.liferay.util.bridges.mvc.MVCPortlet;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Created by Rakesh on 6/14/2017.
 */
@Component
@RequestMapping("view")
public class UserDashBoard extends MVCPortlet {

    @RenderMapping
    public String view(RenderRequest request, RenderResponse response, ModelMap model) {
        return "dashboard/view";
    }


}
