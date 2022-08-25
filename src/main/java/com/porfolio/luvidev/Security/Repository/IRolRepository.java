package com.porfolio.luvidev.Security.Repository;

import com.porfolio.luvidev.Security.Entity.Rol;
import com.porfolio.luvidev.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
