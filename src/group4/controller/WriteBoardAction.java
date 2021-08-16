package group4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group4.comm.Action;
import group4.comm.Forward;
import group4.service.BoardService;

public class WriteBoardAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardService service=BoardService.getService();
		service.writeBoard();
		
		
		Forward f=new Forward();
		f.setForward(true);
		f.setPath("main.jsp?page=list.jsp");
		return f;
	}

}
