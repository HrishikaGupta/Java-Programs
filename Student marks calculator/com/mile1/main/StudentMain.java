
package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
	static Student[] data=new Student[9];
	StudentMain(){
		data[0]=new Student("A1",new int[] {72,73,74});
		data[1]=new Student("B1",new int[] {75,76,77});
		data[2]=new Student("C1",new int[] {99,99,99});
		data[3]=new Student("C3",new int[] {100,100,99});
		data[4]=new Student("B2",new int[] {13,88,13});
		data[5]=new Student("C3",new int[] {14,14,99});
		data[6]=new Student("A2",new int[] {77,55,12});
		data[7]=new Student(null,new int[] {13,88,13});
		data[8]=new Student("A2",null);
	}

	public static void main(String[] args) {
	
		StudentReport f=new StudentReport();
		StudentMain s=new StudentMain();
		String[] grades=new String[data.length];
		int k=0;
		for(int i=0;i<s.data.length;i++) {
			try {
			if(f.validate(s.data[i]).equals("VALID")) {
				grades[k]=f.findGrades(s.data[i]);
				k++;
				System.out.println("Grade is "+f.findGrades(s.data[i]));
			}
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		StudentService st=new StudentService();
		System.out.println("No. of Null Objects = "+st.findNumberOfNullObjects(s.data));
		System.out.println("No. of Null Arrays = "+st.findNumberOfNullMarksArray(s.data));
		System.out.println("No. of Null Name = "+st.findNumberOfNullName(s.data));
	}

}
