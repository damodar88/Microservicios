package com.damodar.springbootitem.models.service;

import java.util.List;

import com.damodar.springbootitem.models.Item;

public interface ItemService {
	
	public List< Item > findAll();
	public Item findById( Long id, Integer cantidad );

}
