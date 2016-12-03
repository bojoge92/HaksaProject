package kr.ac.hansung.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kr.ac.hansung.model.Haksa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HaksaDAO {
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatemen = "select count(*) from haksa";
		return jdbcTemplateObject.queryForObject(sqlStatemen, Integer.class);
	}

	// querying and returning a single object
	public Haksa getHaksa(String code) {
		String sqlStatement = "select * from haksa where code=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { code }, new HaksaMapper());
	}
	
	// querying and returning multiple object
	public List<Haksa> getHaksa() {
		String sqlStatement = "select * from haksa";
		return jdbcTemplateObject.query(sqlStatement, new HaksaMapper());
	}
	
	public List<Haksa> getYearSemesterDetail(int year, int semester) {
		String sqlStatement = "select * from haksa where year=" + year + " and semester=" + semester;
		return jdbcTemplateObject.query(sqlStatement, new HaksaMapper());
	}
	
	public List<Haksa> getNewSemester() {
		String sqlStatement = "select * from haksa where year=2017";
		return jdbcTemplateObject.query(sqlStatement, new HaksaMapper());
	}
	
	public boolean insert(Haksa haksa) {
		int year = haksa.getYear();
		int semester = haksa.getSemester();
		String code = haksa.getCode();
		String name = haksa.getName();
		String section = haksa.getSection();
		int point = haksa.getPoint();
		
		String sqlStatement = "insert into haksa (year, semester, code, name, section, point) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year, semester, code, name, section, point}) == 1);
	}
	
	public boolean update(Haksa haksa) {
		int year = haksa.getYear();
		int semester = haksa.getSemester();
		String code = haksa.getCode();
		String name = haksa.getName();
		String section = haksa.getSection();
		int point = haksa.getPoint();
		
		String sqlStatement = "update haksa set year=?, semester=?, name=?, section=?, point=? where code=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year, semester, code, name, section, point}) == 1);
	}
	
	public boolean delete(String code) {
		String sqlStatement = "delete from haksa where code=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{code}) == 1);
	}
}
