package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import kr.ac.hansung.model.Haksa;

public class HaksaMapper implements RowMapper<Haksa> {

	public Haksa mapRow(ResultSet rs, int rowNum) throws SQLException {

		Haksa haksa = new Haksa();
		
		haksa.setYear(rs.getInt("year"));
		haksa.setSemester(rs.getInt("semester"));
		haksa.setCode(rs.getString("code"));
		haksa.setName(rs.getString("name"));
		haksa.setSection(rs.getString("section"));
		haksa.setPoint(rs.getInt("point"));
		
		return haksa;

	}

}
