package com.insurance.profilesservice.repository;

import com.insurance.profilesservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
