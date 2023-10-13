package com.scaler.splitwise1.Repository;

import com.scaler.splitwise1.models.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllBy(String username);
    User save(User user);
}
