package com.saka.demo.graphql.sakagraphql;

import com.saka.demo.graphql.sakagraphql.mutation.Mutation;
import com.saka.demo.graphql.sakagraphql.query.Query;
import com.saka.demo.graphql.sakagraphql.repository.EmpregadoRepository;
import com.saka.demo.graphql.sakagraphql.repository.ProjetoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SakaGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakaGraphqlApplication.class, args);
	}

	@Bean
	public Query query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
		return new Query(empregadoRepository, projetoRepository);
	}

	@Bean
	public Mutation mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
		return new Mutation(empregadoRepository, projetoRepository);
	}

}
