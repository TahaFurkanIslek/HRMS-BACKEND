package HRMS_Proje.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Table(name="users")
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
@Data
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="e_posta")
	private String EPosta;
	
	@Column(name="sifre")
	private String sifre;
	
	@OneToOne(mappedBy="cvUser")
	private Cv cv;
	
	
	
	
	
	
	
	
	
	/*public user(int id, String e_posta, String sifre) {
		super();
		this.id = id;
		this.e_posta = e_posta;
		this.sifre = sifre;
	}
	public user(int id) {
		super();
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getE_posta() {
		return e_posta;
	}

	public void setE_posta(String e_posta) {
		this.e_posta = e_posta;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}*/
	
}
