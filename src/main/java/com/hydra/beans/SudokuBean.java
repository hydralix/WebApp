package com.hydra.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "sudoku")
@SessionScoped
public class SudokuBean implements Serializable{
	String idButton = "NULL";
	
	public String getIdButton() {
		return idButton;
	}

	public void setIdButton(String idButton) {
		this.idButton = idButton;
	}
	
	public void someMethod(String param) {
			System.out.println(param);
			idButton = param;
		}
}
