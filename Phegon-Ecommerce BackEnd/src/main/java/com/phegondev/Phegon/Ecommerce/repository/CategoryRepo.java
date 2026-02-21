package com.phegondev.Phegon.Ecommerce.repository;

import com.phegondev.Phegon.Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
