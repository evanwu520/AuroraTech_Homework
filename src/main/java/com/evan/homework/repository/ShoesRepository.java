package com.evan.homework.repository;


import com.evan.homework.model.Box;
import com.evan.homework.model.Shoes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoesRepository extends PagingAndSortingRepository<Shoes, String> {


    @Query(value= "select  * from  shoes  where status = 0 order by sequence limit 1 ",  nativeQuery = true)
    Optional<Shoes> findUnCombineShoes();
}
