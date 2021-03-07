package com.mile1.service;
import com.mile1.bean.*;
public class StudentService
{
  public int findNumberOfNullMarksArray(Student s[])
  {
	  int C=0;
	  if(s!=null) {
	  
	  for(Student st:s)
	  {
		  if(st!=null) {
		  if(st.getMarks()==null) {
			 C+=1;
		  }
		  }
	  }
	  return C;
  }
	  return -1;
}
  public int findNumberOfNullName(Student s[])
  {
	  int C=0;
	if(s!=null)
	{
		for(Student st:s)
		  {
			if(st!=null)
			  if(st.getName()==null) {
				 C+=1;
			  }
		  }
		  return C;
	  }
		  return -1;	
	}
  
  public int findNumberOfNullObjects(Student s[])
  {
	  int C=0;
		if(s!=null)
		{
			for(Student st:s)
			  {
				  if(st==null)
					  C++;
			  }
			return C;
		}
		return -1;
  
}
}
