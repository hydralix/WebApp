package com.hydra.Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean
@SessionScoped
public class PageController implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	public String helloPage(){
		return "success";
	}

}