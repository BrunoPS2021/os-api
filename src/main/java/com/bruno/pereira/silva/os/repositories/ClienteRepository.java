package com.bruno.pereira.silva.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bruno.pereira.silva.os.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query("SELECT obj FROM Cliente obj WHERE obj.cpf =:cpf")
	Cliente findByCPF(@Param("cpf") String cpf);
}
