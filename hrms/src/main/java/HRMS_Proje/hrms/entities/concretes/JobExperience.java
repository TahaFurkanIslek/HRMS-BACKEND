package HRMS_Proje.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_experience")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="start_time")
	private int start_time;
	
	@Column(name="finish_time")
	private int finish_time;
	
	@Column(name="is_continue")
	private boolean is_Continue;
	
	/*@Column(name="Cv_id")
	private int Cv_id;*/
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

}
