package HRMS_Proje.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="jobpostings")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//@Column(name="job_position_id")
	//private int job_position_id;
	
	@Column(name="job_description")
	private String job_Description;
	
	@Column(name="city")
	private String city;
	
	@Column(name="min_salary")
	private int min_salary;
	
	@Column(name="max_salary")
	private int max_salary;
	
	@Column(name="numberofopenpositions")
	private int numberOfOpenPositions;
	
	@Column(name="lastapplicationdeadline")
	private LocalDate lastapplicationdeadline;
	
	/*@Column(name="companyname")
	private String companyName;*/
	
	/*@Column(name="employer_id")
	private int employerId;*/
	
	@Column(name="active")
	private Boolean active;
	
	@Column(name="jobtype")
	private String jobType;
	
	@Column(name="jobtimetype")
	private String jobTimeType;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobposition;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	
}
