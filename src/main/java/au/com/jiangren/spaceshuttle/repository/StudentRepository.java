package au.com.jiangren.spaceshuttle.repository;

import au.com.jiangren.spaceshuttle.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
