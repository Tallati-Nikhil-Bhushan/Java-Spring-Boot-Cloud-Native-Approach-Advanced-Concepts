package com.springapp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.store.items.Egg;

@Repository("eggRepository")
public interface EggRepository extends JpaRepository<Egg, Long> {

}
