package com.hexaware.hospital;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hexaware.hospital.EncryptPassword;
import com.hexaware.hospital.Patient;

public class PatientDao {

private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Patient> showPatient() {
		String cmd = "select * from patient";
		List<Patient> patients =  jdbcTemplate.query(cmd, new RowMapper<Patient>() {

			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Patient patient = new Patient();
				patient.setPatientID(rs.getInt("PatientID"));
				return patient;
			}
		});
		return patients;
	}
	
	public String addPatient(Patient patient) {
		String cmd = "Insert into Patient(firstName,lastName,Age,Gender,PhoneNumber,Symptoms,Natureofvisit,"
				+ "Email,password) values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {patient.getFirstName(), patient.getLastName(),
				patient.getAge(), patient.getGender(), patient.getPhoneNumber(), patient.getSymptoms(),
				patient.getNatureOfVisit(), patient.getEmail(), patient.getPassword()
			});
		return "Inserted...";
	}
	
	public String insertPatientDao(Patient patient) {
		String pwd = EncryptPassword.getCode(patient.getPassword());
		patient.setPassword(pwd);
		String cmd = "Insert into Patient(patientID,firstName,lastName,age,gender,phoneNumber,symptoms,natureofVisit,email,password) "
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {patient.getPatientID(), 
						patient.getFirstName(), patient.getLastName(), patient.getAge(),
						patient.getGender(), patient.getPhoneNumber(), patient.getSymptoms(),
						patient.getNatureOfVisit(), patient.getEmail(), patient.getPassword()
				});
		System.out.println("Patient Added Successfully");		
		return "Record Inserted...";
	}
}
