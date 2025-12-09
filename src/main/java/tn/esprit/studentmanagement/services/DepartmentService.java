package tn.esprit.studentmanagement.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.studentmanagement.entities.Department;
import tn.esprit.studentmanagement.repositories.DepartmentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor // Lombok generates constructor for dependency injection
public class DepartmentService implements IDepartmentService {

    private final DepartmentRepository departmentRepository; // final ensures it's injected

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
