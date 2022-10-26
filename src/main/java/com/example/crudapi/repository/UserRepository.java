package com.example.crudapi.repository;

import com.example.crudapi.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository
    extends JpaRepository<UsersEntity, Integer> {
    List<UsersEntity> findAllByName(String name);
    List<UsersEntity> findAllByNameAndEmail(String name, String email);
    List<UsersEntity> findAllByNameOrEmail(String name, String email);
    List<UsersEntity> findAllByNameContainingIgnoreCase(String name);
    List<UsersEntity> findAllByNameOrderByEmail(String email);

}
