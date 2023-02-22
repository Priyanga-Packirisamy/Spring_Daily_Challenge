package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
