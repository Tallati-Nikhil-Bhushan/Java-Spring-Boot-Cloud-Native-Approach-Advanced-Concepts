package com.springapp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.store.items.Milk;

@Repository
public interface MilkRepository extends JpaRepository<Milk, Long> {

}
