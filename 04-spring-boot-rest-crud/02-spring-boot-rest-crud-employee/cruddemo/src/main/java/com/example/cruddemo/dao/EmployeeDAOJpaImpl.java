package com.example.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

// import org.springframework.beans.factory.annotation.Autowired;

import com.example.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    //@Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Employee thEmployee = entityManager.find(Employee.class, theId);
        return thEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);

        theEmployee.setId(dbEmployee.getId());

        return theEmployee;
    }

    @Override
    public void deleteById(int theId) {
        Employee thEmployee = entityManager.find(Employee.class, theId);

        entityManager.remove(thEmployee);
    }
    
}
