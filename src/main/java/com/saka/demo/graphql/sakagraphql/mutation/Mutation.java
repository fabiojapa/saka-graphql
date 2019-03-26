package com.saka.demo.graphql.sakagraphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.saka.demo.graphql.sakagraphql.entity.Empregado;
import com.saka.demo.graphql.sakagraphql.repository.EmpregadoRepository;
import com.saka.demo.graphql.sakagraphql.repository.ProjetoRepository;

import java.util.Date;

public class Mutation implements GraphQLMutationResolver {

    private EmpregadoRepository empregadoRepository;
    private ProjetoRepository projetoRepository;

    public Mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
        this.empregadoRepository = empregadoRepository;
        this.projetoRepository = projetoRepository;
    }

    public Empregado novoEmpregado(String nome, Integer idade) {
        Empregado empregado = new Empregado(nome, idade, new Date());
        empregadoRepository.save(empregado);
        return empregado;
    }

    public boolean deletarEmpregado(Long id) {
        empregadoRepository.deleteById(id);
        return true;
    }

}
