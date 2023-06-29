package com.edata;

import java.util.ArrayList;

public class empimp implements empinterface {

	@Override
	public void save(emp p) {
		
		
		empcommondata.writedata(p);
		
	}

	@Override
	public ArrayList<emp> getdata() {

		ArrayList<com.edata.emp> data = empcommondata.getdata();

		return data;
	}

	@Override
	public emp getbasedonID(int eid) {
		
		emp d=null;
		ArrayList<emp> e=empcommondata.getdata();
		for(emp m:e)
		{
			
			if(m.getEid()==eid)
			{
				d=m;
			}
		}

		return d;
	}

	@Override
	public ArrayList<emp> getbasedoname(String ename) {

		ArrayList<emp> k = new ArrayList<>();

		ArrayList<emp> data = empcommondata.getdata();
		for (emp n : data) 
		{
			if (n.getEname().equals(ename)) 
			{
				k.add(n);
			}	

		}

		return k;
	}

	@Override
	public ArrayList<emp> getbasedondsg(String edsg) {
		ArrayList<emp> k = new ArrayList<>();

		ArrayList<emp> data = empcommondata.getdata();
		for (emp n : data) 
		{
			if (n.getEdsg().equals(edsg)) 
			{
				k.add(n);
			}	

		}

		return k;

	
	}

	@Override
	public  double getsalary() {
		double esal=0.0;
	ArrayList<emp> e=empcommondata.getdata();
		
		for(emp n:e)
		{
		esal=esal+n.getEsal();
		
	}
		System.out.println("total salary"+esal);
		return esal;
	}
}
