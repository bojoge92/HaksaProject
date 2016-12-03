package kr.ac.hansung.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HaksaCalculator {

	public ArrayList<Integer> getYearSemesterArray(List<Haksa> haksa) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		int cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7;
		cnt1 = cnt2 = cnt3 = cnt4 = cnt5 = cnt6 = cnt7 = 0;

		for (int i = 0; i < haksa.size(); i++) {
			if (haksa.get(i).getYear() == 2012
					&& haksa.get(i).getSemester() == 1) {

				cnt1 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2012
					&& haksa.get(i).getSemester() == 2) {

				cnt2 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2013
					&& haksa.get(i).getSemester() == 1) {

				cnt3 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2013
					&& haksa.get(i).getSemester() == 2) {

				cnt4 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2014
					&& haksa.get(i).getSemester() == 1) {

				cnt5 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2014
					&& haksa.get(i).getSemester() == 2) {

				cnt6 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getYear() == 2016
					&& haksa.get(i).getSemester() == 1) {

				cnt7 += haksa.get(i).getPoint();
			}
		}

		list.add(cnt1);
		list.add(cnt2);
		list.add(cnt3);
		list.add(cnt4);
		list.add(cnt5);
		list.add(cnt6);
		list.add(cnt7);

		return list;
	}

	public ArrayList<Integer> getSectionPoint(List<Haksa> haksa) {
		ArrayList<Integer> pointList = new ArrayList<Integer>();

		int cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, total;
		cnt1 = cnt2 = cnt3 = cnt4 = cnt5 = cnt6 = cnt7 = total = 0;

		for (int i = 0; i < haksa.size(); i++) {
			if (haksa.get(i).getSection().contains("핵교A")) {
				cnt1 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("핵교B")) {
				cnt2 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("교필")) {
				cnt3 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("일교")) {
				cnt4 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("전기")) {
				cnt5 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("전지")) {
				cnt6 += haksa.get(i).getPoint();
			} else if (haksa.get(i).getSection().contains("전선")) {
				cnt7 += haksa.get(i).getPoint();
			}
		}

		total = cnt1 + cnt2 + cnt3 + cnt4 + cnt5 + cnt6 + cnt7;

		pointList.add(cnt1);
		pointList.add(cnt2);
		pointList.add(cnt3);
		pointList.add(cnt4);
		pointList.add(cnt5);
		pointList.add(cnt6);
		pointList.add(cnt7);
		pointList.add(total);

		return pointList;
	}
	
	
}
