package com.saka.demo.graphql.sakagraphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.saka.demo.graphql.sakagraphql.entity.Empregado;
import com.saka.demo.graphql.sakagraphql.repository.EmpregadoRepository;
import com.saka.demo.graphql.sakagraphql.repository.ProjetoRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private EmpregadoRepository empregadoRepository;
    private ProjetoRepository projetoRepository;

    public Query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
        this.empregadoRepository = empregadoRepository;
        this.projetoRepository = projetoRepository;
    }

    public List<Empregado> obterEmpregados() {
        return empregadoRepository.findAll();
    }

    public long contarEmpregados() {
        return empregadoRepository.count();
    }

    public Empregado obterEmpregadoPorId(Long id) {
        return empregadoRepository.findById(id).orElseThrow(null);
    }

}
