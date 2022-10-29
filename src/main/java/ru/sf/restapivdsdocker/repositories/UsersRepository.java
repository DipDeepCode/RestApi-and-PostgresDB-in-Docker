package ru.sf.restapivdsdocker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sf.restapivdsdocker.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
