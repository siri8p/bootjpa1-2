package com.telugu.bootjpa12.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telugu.bootjpa12.entity.Student;

public interface StudentRepo extends JpaRepository <Student ,Long>{

}
