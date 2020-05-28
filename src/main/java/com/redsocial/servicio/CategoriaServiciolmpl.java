package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.redsocial.entidad.Categoria;
import com.redsocial.repositorio.CategoriaRepositorio;


@Service
public class CategoriaServiciolmpl implements CategoriaServicio{
	
	@Autowired
	private CategoriaRepositorio repositorio;

	@Override
	public List<Categoria> listaCategoria() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

		

}
