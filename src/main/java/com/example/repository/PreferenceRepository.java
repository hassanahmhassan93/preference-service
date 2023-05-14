package com.example.repository;

import com.example.model.Preference;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PreferenceRepository extends CrudRepository<Preference, Integer> {

    Preference findByUserId(Integer userId);
}
