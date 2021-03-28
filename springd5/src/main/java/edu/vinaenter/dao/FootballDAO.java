package edu.vinaenter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.vinaenter.model.Football;

@Repository
public class FootballDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Football> getList() {
		String sql = "SELECT * FROM football ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Football.class));
	}
	
	public Football getFootball(int id) {
		String sql = "SELECT * FROM football WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Football.class), id);
	}
	
	public int save(Football football) {
		String sql = "INSERT INTO football(name,createDate,description) VALUES (?,?,?)";
		return jdbcTemplate.update(sql, football.getName(), football.getCreateDate(), football.getDescription());
	}
	
}
