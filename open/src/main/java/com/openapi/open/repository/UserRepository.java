package com.openapi.open.repository;

import com.openapi.open.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

List<User> findByName(String name);
List<User> findByContact(String contact);

}
