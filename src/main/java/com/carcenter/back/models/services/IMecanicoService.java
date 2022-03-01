package com.carcenter.back.models.services;

import java.util.List;

import com.carcenter.back.models.entity.Mecanico;

public interface IMecanicoService {
	public List<Mecanico> findAll();
	public Mecanico save(Mecanico mecanico);

}
