package com.example.cruddemo.dao;



import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    // @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> thTypedQuery = entityManager.createQuery("FROM Student where lastName=:LastName", Student.class);
        thTypedQuery.setParameter("LastName",lastName);
        return thTypedQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Student myStudent = entityManager.find(Student.class, id);
        entityManager.remove(myStudent);
    }


    @Override
    @Transactional
    public int deleteAll() {
        int rowDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return rowDeleted;
    }
       
}
