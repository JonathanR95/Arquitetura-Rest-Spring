package com.dio.restspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.restspring.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}