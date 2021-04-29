package model;

public class LectureLogic {
	private String lecture = "lecture";

	public String execute(String pageNo) {

		try {
			int page = Integer.parseInt(pageNo);
			this.lecture += page + ".jsp";

		}catch(Exception e){

			this.lecture = "lectureTop.jsp";
		}finally {

		}
		return lecture;
	}

}
