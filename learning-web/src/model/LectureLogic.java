package model;

public class LectureLogic {
	private String lecture = "lecture";

	public String execute(String no) {
		this.lecture += no + ".jsp";
		return lecture;
	}

}
