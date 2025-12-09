package tn.esprit.studentmanagement.services;

import org.springframework.stereotype.Service;
import tn.esprit.studentmanagement.entities.Department;
import tn.esprit.studentmanagement.repositories.DepartmentRepository;

import java.util.List;
import java.util.Optional;

@Service

public class DepartmentService implements IDepartmentService {
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long idDepartment) {
        Optional<Department> department = departmentRepository.findById(idDepartment);
        if (department.isPresent()) {
            return department.get();
        } else {
            throw new RuntimeException("Department not found with id: " + idDepartment);
        }
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long idDepartment) {
departmentRepository.deleteById(idDepartment);
    }
}
