package com.spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_app.store.items.Apple;
import com.spring_app.store.items.Item;

@Repository
public interface StoreRepository extends JpaRepository<Item, Long> {

}
