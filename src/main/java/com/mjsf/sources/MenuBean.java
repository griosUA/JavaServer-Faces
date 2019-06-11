/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.sources;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author grisha
 */
@ManagedBean
@RequestScoped
public class MenuBean {
    private String pageName;
    private String fullPath;
    
    public MenuBean(){
    }
    
    @PostConstruct
    public void init()
    {
        Object request = FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if (request instanceof HttpServletRequest)
        {
            String address = ((HttpServletRequest) request).getRequestURL().toString();

            String[] parts = address.split("/");
            pageName = parts.length > 5 ? parts[5] : "";

            if (pageName.endsWith(".xhtml"))
            {
                pageName = pageName.substring(0, pageName.length() - 6);
            }
        }
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
    
    
}
