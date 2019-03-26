
## Subir o MySQL
docker-compose -f ./docker/docker-compose.yml up

## Subir a aplicação
rodar: com.saka.demo.graphql.sakagraphql.SakaGraphqlApplication

## Entrar na url do graphql
http://localhost:8090/graphiql

* inserir:

mutation { 
  novoEmpregado(nome: "Guilherme", idade: 24) {
    id
  }
}

* consultar:

{ 
  obterEmpregados {
    id, nome, idade
  }
}