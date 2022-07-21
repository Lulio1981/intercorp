package com.intercorp.demo.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ReportClientWithDead {
	
	private String id;
	
	private String nombre;
	
	private String dni;
	
	private String apellido;
	
	private Integer edad;
	
	private Date fechaNacimiento;
	
	private LocalDate fechaProbableMuerte;

}
