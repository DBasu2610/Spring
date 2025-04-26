package com.example.cruddemo;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			 //createStudentDAO(studentDAO);         C
			 createMultipleStudent(studentDAO);
			// readStudent(studentDAO);              R
			// queryForStudent(studentDAO);
			// queryByLastName(studentDAO);
			//  updateStudent(studentDAO);           U
			 //deleteStudent(studentDAO);            D
			//  deleteAllStudents(studentDAO);
																							};
																					
																						}
																					
																					
																						private void deleteAllStudents(StudentDAO studentDAO) {
					System.out.println("Deleting All Students");
					System.out.println("No. of Rows Deleted : " +studentDAO.deleteAll());
				}
			 
			 
																						private void deleteStudent(StudentDAO studentDAO) {
					int studentId = 2;
					System.out.println("Deleting Student with id:" + studentId);
					studentDAO.deleteById(studentId);
				}
			 
			 
																			private void updateStudent(StudentDAO studentDAO) {
					Student myStudent = studentDAO.findById(2);
					System.out.println("Updating Student with id:" + myStudent.getId());
					myStudent.setFirstName("Scooby");
					studentDAO.update(myStudent);

					System.out.println("Student Updated: " + myStudent);
				}
			 
			 
																private void queryByLastName(StudentDAO studentDAO) {
					List<Student> students = studentDAO.findByLastName("Doe");
					for(Student student : students) {
						System.out.println("Student: " + student);
					}
				}
			
			
													private void queryForStudent(StudentDAO studentDAO) {
					List<Student> students = studentDAO.findAll();

					for(Student student : students) {
						System.out.println("Student: " + student);
					}
				}
			
			
										private void readStudent(StudentDAO studentDAO) {
					System.out.println("Reading Student Object---------------------------------");
					Student tempStudent4 = new Student("Daffy", "Duck", "dduck@gmail.com");
					System.out.println("Saving Student Object---------------------------------");
					studentDAO.save(tempStudent4);
					System.out.println("Student Saved! ID Generated:" + tempStudent4.getId());
					System.out.println("Reading Student Object---------------------------------" + tempStudent4.getId());
					Student myStudent = studentDAO.findById(tempStudent4.getId());
					System.out.println("Student Retrieved: " + myStudent);
					

					
							}
			
			
							private void createStudentDAO(StudentDAO studentDAO) {
					System.out.println("Creating new Student Object---------------------------------");
					Student tempStudent = new Student("John","Doe","johndoe@gmail.com");


					System.out.println("Saving Student Object---------------------------------");
					studentDAO.save(tempStudent);

					System.out.println("Student Saved! ID Generated:" + tempStudent.getId());

					
				}

				public void createMultipleStudent(StudentDAO studentDAO) {
					System.out.println("Creating new Student Object---------------------------------");
					Student tempStudent1 = new Student("Paul","Doe","pauldoe@gmail.com");
					Student tempStudent2 = new Student("Mary","Public","marypublic@gmail.com");
					Student tempStudent3 = new Student("Bonita","Applebum","bapple@gmail.com");

					System.out.println("Saving Student Object---------------------------------");
					studentDAO.save(tempStudent1);
					studentDAO.save(tempStudent2);
					studentDAO.save(tempStudent3);

					System.out.println("Student Saved! ID Generated:" + tempStudent1.getId());
					System.out.println("Student Saved! ID Generated:" + tempStudent2.getId());
					System.out.println("Student Saved! ID Generated:" + tempStudent3.getId());
				}

}
