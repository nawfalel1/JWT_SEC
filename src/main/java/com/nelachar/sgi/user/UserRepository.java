package com.nelachar.sgi.user;

import com.nelachar.sgi.user.User;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

     Optional<User> findByUsername(String email);
}
