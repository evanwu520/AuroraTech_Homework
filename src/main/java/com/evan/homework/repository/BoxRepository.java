package com.evan.homework.repository;

import com.evan.homework.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoxRepository extends PagingAndSortingRepository<Box, String> {


    @Query(value= "select  * from  box  where status = 0 order by sequence limit 1 ",  nativeQuery = true)
    Optional<Box> findUnCombineBox();


    @Query(value= "select  max(sequence) from  box",  nativeQuery = true)
    Optional<Long> findBoxMaxSeq();

}
