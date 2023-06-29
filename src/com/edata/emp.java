package com.edata;

public class emp {
	private int eid;
	private String ename;
	private Double esal;
	private String edsg;
	
	
	
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edsg=" + edsg + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	public String getEdsg() {
		return edsg;
	}
	public void setEdsg(String edsg) {
		this.edsg = edsg;
	}
	
	
	
	

}
