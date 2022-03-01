package com.carcenter.back.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.back.models.dao.IMecanicoDao;
import com.carcenter.back.models.entity.Mecanico;

@Service
public class MecanicoServiceImpl implements  IMecanicoService{

	@Autowired
	private IMecanicoDao mecanicoDao;
	
	@Override
	//@Transactional(readOnly = true)
	public List<Mecanico> findAll() {
		return (List<Mecanico>) mecanicoDao.findAll();
	}

	@Override
	public Mecanico save(Mecanico mecanico) {
		
		return mecanicoDao.save(mecanico);
	}

}
