package jar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String customerName;
	
	private String customerEmail;
	
	private String cutomerPassword;
	
	private String address;
	
	private String favQuestion;
	
	private String favAnswer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCutomerPassword() {
		return cutomerPassword;
	}

	public void setCutomerPassword(String cutomerPassword) {
		this.cutomerPassword = cutomerPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFavQuestion() {
		return favQuestion;
	}

	public void setFavQuestion(String favQuestion) {
		this.favQuestion = favQuestion;
	}

	public String getFavAnswer() {
		return favAnswer;
	}

	public void setFavAnswer(String favAnswer) {
		this.favAnswer = favAnswer;
	}
}
