package schoolApplication.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoolApplication.entity.Student;
import com.schoolApplication.repository.StudentRepository;

public class StudentService {
	
	@Autowired 
	StudentRepository repository;

	public String insert(Student student) {
		repository.save(student);
		return "ata Inserted Successfully";
		
	}

	public String update(Student student) {
		int id=student.getId();
		Student student2=repository.findById(id).get();
		student2.setName(student.getName());
		student2.setSubject(student.getSubject());
		student2.setMarks(student.getMarks());
		repository.save(student2);
		return "Data updated successfully";
	}

	public Student getStudent(int studentid) {
		Student student=repository.findById(studentid).get();
		return student;
	}

	public String deleteDetails(int studentid) {
		Student student=repository.findById(studentid).get();
		if(Objects.nonNull(student)) {
		repository.deleteById(studentid);
		return "Data Deleted Successfully";
		}
		else {
			return "Data not found";
		}
	}
	
	

}
