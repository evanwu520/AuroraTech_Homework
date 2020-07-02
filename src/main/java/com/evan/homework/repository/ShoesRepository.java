package com.evan.homework.repository;


import com.evan.homework.model.Box;
import com.evan.homework.model.Shoes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends PagingAndSortingRepository<Shoes, String> {
}
