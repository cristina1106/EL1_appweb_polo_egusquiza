package com.redsocial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Proveedor;
import com.redsocial.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServiciolmpl implements ProveedorServicio{
	
	@Autowired 
	private ProveedorRepositorio repositorio;

	@Override
	public Proveedor insertaProveedor(Proveedor obj) {
		// TODO Auto-generated method stub
		return repositorio.save(obj);
	}
	
	
	
	

}
