package com.saka.demo.graphql.sakagraphql.repository;

import com.saka.demo.graphql.sakagraphql.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
