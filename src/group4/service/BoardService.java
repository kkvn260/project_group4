package group4.service;

public class BoardService {
	private static BoardService instance=new BoardService();
	public static BoardService getService() {
		return instance;
	}
	private BoardService () {}
	
}
