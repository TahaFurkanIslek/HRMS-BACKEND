package HRMS_Proje.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.NoArgsConstructor;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobpostings"})
@NoArgsConstructor
@Entity
@Data
@Table(name="jobpositions")
public class JobPosition {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="userid")
		private int userId;
		
		@Column(name="positionname")
		private String positionName;
		
		@OneToMany(mappedBy= "jobposition")
		private List<JobPosting> jobpostings;
		
		
		
		
}







