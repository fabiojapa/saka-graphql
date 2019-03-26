package com.saka.demo.graphql.sakagraphql.repository;

import com.saka.demo.graphql.sakagraphql.entity.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}
