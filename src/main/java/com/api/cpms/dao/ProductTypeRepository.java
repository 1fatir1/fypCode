package com.api.cpms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cpms.entities.productType;

public interface ProductTypeRepository extends JpaRepository<productType,Integer> {

}
