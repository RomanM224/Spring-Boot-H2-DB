package com.maistruk.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.maistruk.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
    List<User> findByLang(String tech);
    
    List<User> findByIdGreaterThan(int id);
    
    @Query("from User where lang=?1 order by name")
    List<User> findByLangSorted(String lang); 

}
