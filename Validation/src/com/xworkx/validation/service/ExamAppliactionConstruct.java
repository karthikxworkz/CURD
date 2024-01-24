package com.xworkx.validation.service;

import com.xworkz.validation.Dto.ExamApplicationDto;

public class ExamAppliactionConstruct {
	
	public boolean applicationID(ExamApplicationDto dto) {
		if(dto.getApplicationID().isEmpty()) {
			System.out.println("is empty:"+dto);
		}else if (dto.getApplicationID().isBlank()) {
			System.out.println("is blank:"+dto);
		} else if(dto.getApplicationID().startsWith("2024") ){
				System.out.println("startwith :"+dto);
			}else if(dto.getApplicationID(). {
				
			}
		
				
		return false;
		
			
		}
		
		
	}


