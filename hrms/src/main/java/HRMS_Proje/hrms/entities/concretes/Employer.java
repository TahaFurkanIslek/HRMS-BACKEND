package HRMS_Proje.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employer")
@PrimaryKeyJoinColumn(name="userid")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
@EqualsAndHashCode(callSuper = false)
public class Employer extends User{
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private int userId;*/
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="websitename")
	private String websiteName;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<JobPosting> jobPostings;
}
