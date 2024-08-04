package schoolApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.schoolApplication.entity.Teacher;
import com.schoolApplication.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository repository;

	public String insert(Teacher teacher) {
		repository.save(teacher);
		return "Data saved Successfully";
	}

	public String update(Teacher teacher) {
		Teacher teacher2=repository.findById(teacher.getId()).get();
		teacher2.setName(teacher.getName());
		teacher2.setSubject(teacher.getSubject());
		repository.save(teacher2);
		return "Data updated successfully";
	}

	public Teacher getTeacher(int tecaherid) {
		Teacher teacher=repository.findById(teacherid).get();
		return teacher;
	}

	public String deleteDetails(int teacherid) {
		repository.deleteById(teacherid);
		return "Data deleted sucessfully";
	}

	
	
	

}
