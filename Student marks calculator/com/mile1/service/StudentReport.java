package com.mile1.service;
import com.mile1.exception.*;
import com.mile1.bean.Student;

public class StudentReport extends Student
{
	public String findGrades(Student st)
	{
		 int[] marks=st.getMarks();
		 int sum=0;
		for(int a:marks)
			
		{
			if(a<35)
				return ("F");
			else
				sum+=a;
		}
		if(sum<150)
			return ("C");
		else if(sum<200)
			return ("B");
		else if(sum<250)
			return ("A");
		else 
			return ("A+");
	}
	public String validate(Student st) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
		if(st==null) 
			throw (new NullStudentObjectException());
		if(st.getMarks()!=null) {
			if(st.getName()==null)
			 System.out.println(new NullNameException().toString());
		 return("VALID");}
		else if(st.getName()==null) 
			throw (new NullNameException());
		else if(st.getMarks()==null)
			throw (new NullMarksArrayException());
	    
		return ("VALID");
		
	

}
}
