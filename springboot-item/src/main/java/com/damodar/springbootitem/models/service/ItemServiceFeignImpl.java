package com.damodar.springbootitem.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.damodar.springbootitem.clientes.ProductoClinteRest;
import com.damodar.springbootitem.models.Item;
import com.damodar.springbootitem.models.Producto;

@Service( "serviceFeign" )
@Primary
public class ItemServiceFeignImpl implements ItemService {

	@Autowired
	private ProductoClinteRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map( p -> new Item( p, 1 )).collect( Collectors.toList() ) ;
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item ( clienteFeign.detalle(id), cantidad );
	}

}
