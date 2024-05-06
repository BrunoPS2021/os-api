package com.bruno.pereira.silva.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.pereira.silva.os.domain.Cliente;
import com.bruno.pereira.silva.os.domain.OS;
import com.bruno.pereira.silva.os.domain.Tecnico;
import com.bruno.pereira.silva.os.domain.enuns.Prioridade;
import com.bruno.pereira.silva.os.domain.enuns.Status;
import com.bruno.pereira.silva.os.repositories.ClienteRepository;
import com.bruno.pereira.silva.os.repositories.OSRepository;
import com.bruno.pereira.silva.os.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;	
	
	public void instaciaDB() {
		Tecnico t1 = new Tecnico(null, "Bruno Pereira da Silva", "144.785.300-84", "(88) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Chloé Silva Andrade", "641.760.040-88", "(88) 98888-9999");
		Cliente c1 = new Cliente(null, "Deyse Danielle da Silva Andrade", "598.508.200-80", "(99) 99999-9999");
		Cliente c2 = new Cliente(null, "Miguel Pereira Silva", "014.487.134-39", "(44) 94444-4444");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);
		//OS os2 = new OS(null, Prioridade.BAIXA, "Teste create OS 2", Status.ABERTO, t2, c2);

		t1.getList().add(os1);
		c1.getList().add(os1);
		
		//t2.getList().add(os2);
		//c2.getList().add(os2);
		
		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		osRepository.saveAll(Arrays.asList(os1));
	}
}

