package kr.ac.hansung.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Haksa {
	private int year;
	private int semester;
	
	@NotEmpty(message="The code cannot be empty")
	private String code = "";
	
	@Size(min=1, max=50, message="Name must be between 1 and 50 charaters")
	private String name = "";
	
	@Size(min=1, max=10, message="Section must be between 1 and 10 charaters")
	private String section = "";

	private int point;

	public Haksa() {

	}

	public Haksa(String section) {
		this.section = section;
	}

	public Haksa(int year, int semester, String section, int point) {
		this.year = year;
		this.semester = semester;
		this.section = section;
		this.point = point;
	}

	public Haksa(int year, int semester, String code, String name,
			String section, int point) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.section = section;
		this.point = point;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Haksa [year=" + year + ", semester=" + semester + ", code="
				+ code + ", name=" + name + ", section=" + section + ", point="
				+ point + "]";
	}

}
