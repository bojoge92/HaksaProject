package kr.ac.hansung.service;

import java.util.List;

import kr.ac.hansung.dao.HaksaDAO;
import kr.ac.hansung.model.Haksa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HaksaService {
	
	private HaksaDAO haksaDao;
	
	@Autowired
	public void setOfferDAO(HaksaDAO haksaDao) {
		this.haksaDao = haksaDao;
	}
	
	public List<Haksa> getCurrent() {
			
		return haksaDao.getHaksa();
	}
	

	public void insert(Haksa haksa) {
		haksaDao.insert(haksa);
	}
	
	public List<Haksa> getNumOne(int year, int semester) {
		return haksaDao.getYearSemesterDetail(year, semester);
	}
	
	public List<Haksa> getNewYearHaksa() {
		return haksaDao.getNewSemester();
	}
}
