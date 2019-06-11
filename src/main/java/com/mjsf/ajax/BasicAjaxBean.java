/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author grisha
 */
@ManagedBean
@RequestScoped
public class BasicAjaxBean {
    
    private String ajaxMessage;
    
    public BasicAjaxBean(){
    }
    
    public String getMessage(){
        String resp = "";
        if(ajaxMessage != null) {
            resp = "You masseage is: " + ajaxMessage +"!";
        }
        return resp;
    }

    public String getAjaxMessage() {
        return ajaxMessage;
    }

    public void setAjaxMessage(String ajaxMessage) {
        this.ajaxMessage = ajaxMessage;
    }
    
    
    
    
    
    
    
}
