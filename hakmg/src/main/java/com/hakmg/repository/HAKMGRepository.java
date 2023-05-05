package com.hakmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hakmg.model.HAKMGModel;
//import org.springframework.stereotype.Repository;

//@Repository
public interface HAKMGRepository extends JpaRepository<HAKMGModel,Integer>
{

}
