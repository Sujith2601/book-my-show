package com.sujith.bms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujith.bms.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllById(List<Long> userIds);

    @Override
    Optional<User> findById(Long userId);
}
