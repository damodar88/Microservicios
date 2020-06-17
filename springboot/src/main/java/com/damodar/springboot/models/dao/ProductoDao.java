package com.damodar.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.damodar.springboot.models.entity.Producto;

public interface ProductoDao extends CrudRepository< Producto, Long > {

}
