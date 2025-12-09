package tn.esprit.studentmanagement.entities;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final String EMAIL = "john@example.com";
    private static final String PHONE = "1234567890";
    private static final String ADDRESS = "123 Main St";

    @Test
     void testConstructorAndGetters() {
        Department department = new Department();
        List<Enrollment> enrollments = new ArrayList<>();
        LocalDate dob = LocalDate.of(2000, 1, 1);
        Student student = new Student(1L, FIRST_NAME, LAST_NAME, EMAIL, PHONE, dob, ADDRESS, department, enrollments);
        assertEquals(1L, student.getIdStudent());
        assertEquals(FIRST_NAME, student.getFirstName());
        assertEquals(LAST_NAME, student.getLastName());
        assertEquals(EMAIL, student.getEmail());
        assertEquals(PHONE, student.getPhone());
        assertEquals(dob, student.getDateOfBirth());
        assertEquals(ADDRESS, student.getAddress());
        assertEquals(department, student.getDepartment());
        assertEquals(enrollments, student.getEnrollments());
    }

    @Test
     void testSetters() {
        Student student = new Student();
        student.setIdStudent(2L);
        student.setFirstName(FIRST_NAME);
        student.setLastName(LAST_NAME);
        student.setEmail(EMAIL);
        student.setPhone(PHONE);
        LocalDate dob = LocalDate.of(1999, 5, 15);
        student.setDateOfBirth(dob);
        student.setAddress(ADDRESS);
        Department department = new Department();
        student.setDepartment(department);
        List<Enrollment> enrollments = new ArrayList<>();
        student.setEnrollments(enrollments);
        assertEquals(2L, student.getIdStudent());
        assertEquals(FIRST_NAME, student.getFirstName());
        assertEquals(LAST_NAME, student.getLastName());
        assertEquals(EMAIL, student.getEmail());
        assertEquals(PHONE, student.getPhone());
        assertEquals(dob, student.getDateOfBirth());
        assertEquals(ADDRESS, student.getAddress());
        assertEquals(department, student.getDepartment());
        assertEquals(enrollments, student.getEnrollments());
    }



    @Test
     void testToString() {
        Department department = new Department();
        List<Enrollment> enrollments = new ArrayList<>();
        LocalDate dob = LocalDate.of(2000, 1, 1);
        Student student = new Student(1L, FIRST_NAME, LAST_NAME, EMAIL, PHONE, dob, ADDRESS, department, enrollments);
        String str = student.toString();
        assertTrue(str.contains(FIRST_NAME));
        assertTrue(str.contains(LAST_NAME));
        assertTrue(str.contains(EMAIL));
    }
}
