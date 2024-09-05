package com.springapp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.store.items.Bread;

@Repository
public interface BreadRepository extends JpaRepository<Bread, Long> {

}
