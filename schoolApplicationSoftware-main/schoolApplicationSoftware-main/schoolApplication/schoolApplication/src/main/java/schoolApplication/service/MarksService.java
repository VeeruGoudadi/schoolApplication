package schoolApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolApplication.entity.Marks;
import com.schoolApplication.repository.MarksRepository;

@Service
public class MarksService {
	
	@Autowired 
	MarksRepository marksRepository;

	public Marks getdeatils(int studentId,String subject) {
		Marks marks=new Marks();
		Marks marks=marksRepository.getStudentDetails(studentId,subject);
		           marksRepository.findTeachersBySubject(subject);
		           marks.setSudentId(studentId);
		           
		return marks;
	}
	
	

}
