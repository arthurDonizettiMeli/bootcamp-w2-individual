-- 1
-- Normalização são as regras de padronização para um banco de dados relacional. É utilizada para evitar redundâncias, garantir a integridade referencial e obter otimizações de desempenho.

-- 2
insert into genres (created_at, name, ranking, active) values (now(), 'Genero novo', 13, 1); -- 13

-- 3 e 4
insert into movies (title, rating, awards, release_date, `length`, genre_id) values ('Filme top', 10, 4, now(), 120, 13);

-- 5
update actors set favorite_movie_id = 22 where id = 47;

-- 6
create temporary table movies_temp Select * from movies;

-- 7
delete from movies_temp where awards = 5;

-- 8
select distinct genres.name 
FROM genres 
inner join movies on genres.id = movies.genre_id;

-- 9
select actors.first_name, actors.last_name 
from actors 
inner join movies on movies.id = actors.favorite_movie_id 
where movies.awards > 3;

-- 10
explain create temporary table movies_temp Select * from movies;
/*
 * mysql> explain create temporary table movies_temp Select * from movies;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version 
for the right syntax to use near 'create temporary table movies_temp Select * from movies' at line 1
 * */

explain format=tree delete from movies_temp where awards = 5;
/*
 * mysql> explain format=tree delete from movies_temp where awards = 5;
+----------------------------------------+
| EXPLAIN                                |
+----------------------------------------+
| <not executable by iterator executor>
 |
+----------------------------------------+
1 row in set (0,00 sec)
 * 
 */

-- 11
-- Índice é uma estrutura auxiliar associada a uma tabela afim de ordenar dados em uma determinada sequência. Serve para acelerar o tempo de acessos as linhas de uma tabela.

-- 12
create index idx_movie_name on movies (title);

-- 13 
describe movies;
