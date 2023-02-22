package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Entity.Student;
import Repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo stu;
	
	public Student saveDetails(Student s)
	{
		return stu.save(s);
	}
	
	public List<Student> getAllDetails()
	{
		return stu.findAll();
	}
		public void deleteDepartmentById(int id)
		{
			stu.deleteById(id);
		}
}