package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name="Name")
	@GeneratedValue
	private String name;
	
	@Column(name="Dept")
	@GeneratedValue
	private String dept;
}