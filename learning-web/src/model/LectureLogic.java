package model;

public class LectureLogic {
	private String lecture = "lecture";

	public String execute(String pageNo) {


		this.lecture += pageNo +".jsp";

		return lecture;
	}

}
