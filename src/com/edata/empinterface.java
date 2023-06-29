package com.edata;

import java.util.ArrayList;

import javax.swing.AbstractAction;

public interface empinterface {
	
	
	public abstract void save(emp p);
	
	public abstract ArrayList<emp> getdata();
	
	
	public abstract emp getbasedonID(int eid);
	
	public abstract ArrayList<emp> getbasedoname(String ename);
	
	
	public abstract ArrayList<emp> getbasedondsg(String edsg);
	
	
	public abstract double getsalary();

}
