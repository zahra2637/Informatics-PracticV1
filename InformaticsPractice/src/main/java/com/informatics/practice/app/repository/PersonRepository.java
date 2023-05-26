package com.informatics.practice.app.repository;
import com.informatics.practice.app.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
