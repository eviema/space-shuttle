package au.com.jiangren.spaceshuttle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import au.com.jiangren.spaceshuttle.model.Role;


@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}