package com.gtihub.person.api.person.api.repository;

import com.gtihub.person.api.person.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
