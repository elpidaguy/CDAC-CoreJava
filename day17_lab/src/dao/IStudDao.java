package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Student;

public interface IStudDao {

	List<Student> getStudentList() throws SQLException;
	
}
