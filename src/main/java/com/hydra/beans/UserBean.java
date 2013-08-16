package com.hydra.beans;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
 
@ManagedBean(name="user")
@SessionScoped
public class UserBean{
 
//static Logger logger = Logger.getLogger(UserBean.class.getName());
	
  public void isAdmin(ComponentSystemEvent event){
 
	FacesContext fc = FacesContext.getCurrentInstance();
 
	if (!"admin".equals(fc.getExternalContext().getSessionMap().get("hello"))){
 
		ConfigurableNavigationHandler nav 
		   = (ConfigurableNavigationHandler) 
			fc.getApplication().getNavigationHandler();
 
		nav.performNavigation("access-denied");
	}		
  }	
}