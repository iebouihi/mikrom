package com.microcomm.user.repository;

import com.microcomm.user.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    @Query("SELECT u FROM com.microcomm.user.domaine.User u WHERE u.email = :email")
    User findUserByEmail(
            @Param("email") String email);
}
