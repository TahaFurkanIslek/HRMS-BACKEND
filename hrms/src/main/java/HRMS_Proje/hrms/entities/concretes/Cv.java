package HRMS_Proje.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv")
public class Cv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@Column(name="github_account")
	private String githubAccount;
	
	@Column(name="linkedin_account")
	private String linkedinAccount;
	
	@Column(name="programming_language_and_technology")
	private String programmingLanguageAndTechnology;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	/*@Column(name="userid")
	private int userid;*/
	
	@Column(name="is_graduation")
	private boolean isGraduation;
	
	@OneToOne()
	@JoinColumn(name="userid")
	private User cvUser;
	
	@OneToOne(mappedBy = "cv")
	private Image cvImage;
	
	@OneToMany(mappedBy="cv")
	private List<Language> cvLanguage;
	
	@OneToMany(mappedBy="cv")
	private List<JobExperience> cvJobexperience;
	
}
