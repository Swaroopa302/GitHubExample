package com.date21;


public class Equals_Hashcode {
	int id;
	String fname;
	String lname;
	
	
	Equals_Hashcode(int id,String fname,String lname){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}
	@Override
	public int hashCode()
	{
		return id+lname.hashCode();
	}
	public boolean equals(Object o)
	{
		Equals_Hashcode e = (Equals_Hashcode)o;
		if(this.id==e.id && this.lname.equals(e.lname))
		{
			return true;
		}
		else
			return false;
	}
	
	public String toString(){//overriding the toString() method  
		  return lname;  
		 } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals_Hashcode e1 = new Equals_Hashcode(21,"RamBabu","Sodadasi");
		Equals_Hashcode e2 = new Equals_Hashcode(22,"Swarupa","Thanda");
		Equals_Hashcode e3 = new Equals_Hashcode(21,"RamBabu","Sodadasi");
		System.out.println("e1: "+e1+".."+e1.hashCode());
		System.out.println("e2: "+e2+".."+e2.hashCode());
		System.out.println("e3: "+e3+".."+e3.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("Finally");
	}
}
