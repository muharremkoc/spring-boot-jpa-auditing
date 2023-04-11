package com.audit.springbootjpaauditing.repository;

import com.audit.springbootjpaauditing.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
