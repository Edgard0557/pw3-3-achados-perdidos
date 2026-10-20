create database achadosEPerdidos;
use achadosEPerdidos;

create table ItemPerdido (
			id int not null primary key,
			nomeItem varchar(25) NOT NULL,
			localEncontrado Varchar(25) NOT NULL,
			dataAchado datetime2(6),
			statusItem varchar(15), 
			descricaoDevolucao varchar(100)
			);