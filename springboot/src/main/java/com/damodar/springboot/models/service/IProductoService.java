package com.damodar.springboot.models.service;

import java.util.List;

import com.damodar.springboot.models.entity.Producto;

public interface IProductoService {
	
	public List< Producto > findAll();
	public Producto findById( Long id );

}
