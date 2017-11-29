package au.com.jiangren.spaceshuttle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import au.com.jiangren.spaceshuttle.model.Instructor;

interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
