
# PFA-Docker - Desafio 1

Código fonte do desafio 1 do curso de aceleração PFA-Docker


## Executando

Cria uma network para os containers

```bash
  docker network create pfa
```

Cria e executa o container mysql

```bash
  docker run --rm -d --network=pfa --name pfa-mysql -e MYSQL_ROOT_PASSWORD=root mysql:8.0.26
```

Cria e executa o container com o back-end da api.

```bash
  docker run --rm -d --network=pfa --name pfa-java allissonabn/pfa-java-spring
```

Cria e executa o container com o servidor nginx

```bash
  docker run --rm -d --network=pfa --name pfa-ngix -p 8080:80 allissonabn/pfa-nginx
```

Acesse no seu navegador o endereço http://localhost:8080/modules