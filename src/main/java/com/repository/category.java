package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Category;

public interface category  extends JpaRepository<Category, Integer>{

}
