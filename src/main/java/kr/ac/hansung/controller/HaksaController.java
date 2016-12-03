package kr.ac.hansung.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import kr.ac.hansung.model.Haksa;
import kr.ac.hansung.model.HaksaCalculator;
import kr.ac.hansung.service.HaksaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HaksaController {

	private HaksaService haksaService;

	@Autowired
	public void setHaksaService(HaksaService haksaService) {
		this.haksaService = haksaService;
	}

	@RequestMapping("/home")
	public String goHome(Model model) {
		return "home";
	}
	
	@RequestMapping("/semestershow")
	public String showSemester(Model model) {
		HaksaCalculator yearSemester = new HaksaCalculator();
		List<Haksa> haksas = haksaService.getCurrent();
		ArrayList<Integer> list = yearSemester.getYearSemesterArray(haksas);
		model.addAttribute("list", list);
		return "semestershow";
	}

	@RequestMapping("/sectionshow")
	public String showSection(Model model) {

		HaksaCalculator hc = new HaksaCalculator();
		List<Haksa> haksas = haksaService.getCurrent();

		ArrayList<Integer> pointList = hc.getSectionPoint(haksas);

		model.addAttribute("pointList", pointList);
		return "sectionshow";
	}

	@RequestMapping("/registercourse")
	public String registerCourse(Model model) {
		
		model.addAttribute(new Haksa());
		
		return "registercourse";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Haksa haksa, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println("Form data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "registercourse";
		}
		
		haksaService.insert(haksa);
		
		return "offercreated";
	}

	@RequestMapping("/checkcource")
	public String checkSource(Model model) {
		
		List<Haksa> haksas = haksaService.getNewYearHaksa();
		
		model.addAttribute("haksa", haksas);
		
		return "checkcource";
	}

	@RequestMapping("/re20121")
	public String connectRe20121(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2012, 1);
		model.addAttribute("haksas", haksa);
		return "re20121";
	}

	@RequestMapping("/re20122")
	public String connectRe20122(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2012, 2);
		model.addAttribute("haksas", haksa);
		return "re20122";
	}

	@RequestMapping("/re20131")
	public String connectRe20131(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2013, 1);
		model.addAttribute("haksas", haksa);
		return "re20131";
	}

	@RequestMapping("/re20132")
	public String connectRe20132(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2013, 2);
		model.addAttribute("haksas", haksa);
		return "re20132";
	}

	@RequestMapping("/re20141")
	public String connectRe201241(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2014, 1);
		model.addAttribute("haksas", haksa);
		return "re20141";
	}

	@RequestMapping("/re20142")
	public String connectRe20142(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2014, 2);
		model.addAttribute("haksas", haksa);
		return "re20142";
	}

	@RequestMapping("/re20161")
	public String connectRe20161(Model model) {
		List<Haksa> haksa = haksaService.getNumOne(2016, 1);
		model.addAttribute("haksas", haksa);
		return "re20161";
	}
}
