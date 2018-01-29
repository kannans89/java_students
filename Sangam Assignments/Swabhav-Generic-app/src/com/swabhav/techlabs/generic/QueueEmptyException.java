package com.swabhav.techlabs.generic;
import com.swabhav.student.generic.StudentQ;


public class QueueEmptyException extends RuntimeException{
	
		
		public QueueEmptyException(SwabhavQ Swabhav){
		}
		public QueueEmptyException(StudentQ studentQ) {
		}
		@Override
		public String getMessage()
		{
			return "Queue is Empty..!!";
		}
	

}
