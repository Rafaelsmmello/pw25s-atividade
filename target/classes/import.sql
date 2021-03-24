
INSERT INTO genero (nome) VALUES ('Romance');
INSERT INTO genero (nome) VALUES ('Conto');
INSERT INTO genero (nome) VALUES ('Tragédia');


INSERT INTO cidade (nome) VALUES ('Pato branco');
INSERT INTO cidade (nome) VALUES ('Rio de janeiro');
INSERT INTO cidade (nome) VALUES ('Sao paulo');

INSERT INTO editora (nome) VALUES ('Pearson');
INSERT INTO editora (nome) VALUES ('ThomsonReuters');
INSERT INTO editora (nome) VALUES ('Shueisha');


INSERT INTO autor (nome) VALUES ('George R. R. Martin');
INSERT INTO autor (nome) VALUES ('Nicholas Sparks');
INSERT INTO autor (nome) VALUES ('Friedrich Nietzsche');


INSERT INTO permissao (nome) values('ROLE_ADMIN');
INSERT INTO permissao (nome) values('ROLE_USER');

INSERT INTO usuario(nome, username, password) VALUES ('Administrador', 'admin','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');
INSERT INTO usuario(nome, username, password) VALUES ('Teste', 'teste','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');

INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 1);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 2);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (2, 2);
