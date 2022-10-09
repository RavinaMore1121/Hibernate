package hospitalmanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dr_id")
	private int dr_id;
	@Column(name="dr_name")
	private String dr_name;
	@Column(name="dr_contact")
	private String dr_contact;
	@Column(name="dr_address")
	private String dr_address;
	
	public String getDr_contact() {
		return dr_contact;
	}
	public void setDr_contact(String dr_contact) {
		this.dr_contact = dr_contact;
	}
	public int getDr_id() {
		return dr_id;
	}
	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}
	public String getDr_name() {
		return dr_name;
	}
	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}
	public String getDr_address() { 
		return dr_address;
	}
	public void setDr_address(String dr_address) {
		this.dr_address = dr_address;
	}

}
