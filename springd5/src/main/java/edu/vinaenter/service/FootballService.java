package edu.vinaenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.dao.FootballDAO;
import edu.vinaenter.model.Football;

@Service
public class FootballService {
	
	@Autowired
	private FootballDAO footballDAO;
	
	public List<Football> getList() {
		List<Football> list = footballDAO.getList();
		return list;
	}
	
	public Football getFootball(int id) {
		Football football = footballDAO.getFootball(id);
		return football;
	}
	
	public int save(Football football) {
		int save = footballDAO.save(football);
		return save;
	}
	
}
