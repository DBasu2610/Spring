package com.example.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return args -> {
			// createInstructor(appDAO);
			// findInstructorById(appDAO);
			deleteInstructorById(appDAO);
											};
										}
									
										private void deleteInstructorById(AppDAO appDAO) {
											System.out.println("Deleting instructor with id 1");
					appDAO.deleteInstructorById(1);
					System.out.println("done!");
				}
			
										private void findInstructorById(AppDAO appDAO) {
					Instructor tempInstructor = appDAO.findInstructorById(1);
					System.out.println("Found instructor: " + tempInstructor);

					System.out.println("The asociated instructor detail: " + tempInstructor.getInstructorDetail());
				}
			
							private void createInstructor(AppDAO appDAO) {
					Instructor tempInstructor = new Instructor("Madhu", "Patel", "mp@gmail.com");
					InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.mp.com/youtube", "cooking!!!");
					tempInstructor.setInstructorDetail(tempInstructorDetail);
					System.out.println("Saving instructor: " + tempInstructor);
					appDAO.save(tempInstructor);
					System.out.println("done!");
				}

}
