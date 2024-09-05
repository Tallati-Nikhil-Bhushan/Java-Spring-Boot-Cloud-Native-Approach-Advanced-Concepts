package com.springapp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.store.items.Apple;

@Repository
public interface AppleRepository extends JpaRepository<Apple, Long> {

}
