package com.edata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public  class empcommondata {
	
	
	
	public static void writedata(emp p) 
	{
		try {
			FileWriter fw=new FileWriter("C:\\Users\\Rakesh\\3D Objects\\rakesh\\slokam.txt",true);
			
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("get data");
			
			bw.write(p.getEid()+","+p.getEname()+","+p.getEsal()+","+p.getEdsg());
			bw.newLine();
			bw.close();
			fw.close();
		}	
				catch(Exception e)
		{
					System.out.println(e);
		}
			
	}
	public static ArrayList<emp> getdata()
	
	{
		
		ArrayList<emp> k=new ArrayList<emp>();
		try {
			FileReader fr=new FileReader("C:\\Users\\Rakesh\\3D Objects\\rakesh\\slokam.txt");
			
			BufferedReader br=new BufferedReader(fr);
			for(String s=br.readLine();s!=null; s=br.readLine() ) 
			{
				String[] b=s.split(",");
				emp p=new emp();
				
				p.setEid(Integer.parseInt(b[0]));
				
				p.setEname(b[1]);
				
				p.setEsal(Double.valueOf(b[2]));
				
				p.setEdsg(b[3]);
				
			k.add(p);
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		
		}
		
		
		return k;
		
	}

	}
	


