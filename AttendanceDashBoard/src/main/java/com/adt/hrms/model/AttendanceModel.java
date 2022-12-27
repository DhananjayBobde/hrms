package com.adt.hrms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Attendance")
@Data
public class AttendanceModel {
	
	@Id
	@Column(name = "attendanceId")
	 private int attendanceId;
	
	@Column(name = "checkOut")
	    private String checkOut;
	@Column(name = "checkIn")
	    private String checkIn;
	@Column(name = "workingHour")
	    private String workingHour;
	@Column(name = "date")
	    private String date;

}
