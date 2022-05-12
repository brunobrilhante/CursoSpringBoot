package com.brunobrilhante.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunobrilhante.cursospringboot.domain.Pedido;
import com.brunobrilhante.cursospringboot.repositories.PedidoRepository;
import com.brunobrilhante.cursospringboot.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id" + id + ", Tipo: " + Pedido.class.getName()));
	}
}
