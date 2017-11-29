package au.com.jiangren.spaceshuttle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import au.com.jiangren.spaceshuttle.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
