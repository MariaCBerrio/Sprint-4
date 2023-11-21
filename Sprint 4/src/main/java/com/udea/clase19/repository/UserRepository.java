package com.udea.clase19.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <com.udea.clase19.entity.User, Integer> {
}
