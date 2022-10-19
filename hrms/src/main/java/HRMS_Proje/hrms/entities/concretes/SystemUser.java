package HRMS_Proje.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="userid")
@EqualsAndHashCode(callSuper = false)
@Table(name="systemusers")
public class SystemUser extends User{
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
}
