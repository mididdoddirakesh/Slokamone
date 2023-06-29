package com.edata;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
//
///*		empimp e = new empimp();
//
//		// GET SAVE DATA
//		ArrayList<com.edata.emp> data = empcommondata.getdata();
//
//			emp p = new emp();
//			p.setEid(88);
//
//			boolean b = true;
//			for (com.edata.emp t : data) 
			{
//
//			if (p.getEid() == t.getEid()) {
//				b = false;
//			}
//
//		}
//
//		if (b == true) {
//
//			p.setEname("naresh");
//			p.setEsal(256.02);
//			p.setEdsg("se");
//
//			e.save(p);
//
//			System.out.println("completed");
//		} else {
//			System.out.println("no match");
//		}
//
////	//GET BASED ONID
////	emp t=e.getbasedonID(4);
////	System.out.println(t);
////	
//		// GETSALARY
////	e.getsalary();*/
//		//get basedONNAME
//		empimp e = new empimp();
//		ArrayList<emp> h = e.getbasedoname("naresh");
//
//		System.out.println(h);

//	}
	//GET BASED ON DSG
	empimp k = new empimp();

	ArrayList<emp> g= k.getbasedondsg("se");
	
	System.out.println(g);

	}
	
	}}
