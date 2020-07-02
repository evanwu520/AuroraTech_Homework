package com.evan.homework.repository;

import com.evan.homework.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends PagingAndSortingRepository<Box, String> {
}
