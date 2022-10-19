package HRMS_Proje.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithLoginDetailsDto {
	private String ePosta;
	private String sifre;
}
