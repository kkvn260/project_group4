package group4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import group4.dto.BoardDTO;

public class BoardDAO {
	private static BoardDAO instance=new BoardDAO();
	public static BoardDAO getDAO() {
		return instance;
	}
	public void writeBoard(Connection conn,BoardDTO dto) {
		StringBuilder sql=new StringBuilder();
		sql.append("	insert into	Board_Group4(						");
		sql.append("							title					");
		sql.append("							,id						");
		sql.append("							,viewno					");
		sql.append("							,content				");
		sql.append("							,writedate				");
		sql.append("							,board_name				");
		sql.append("							,likeno)				");
		sql.append("			values(	?,?,0,?,sysdate(),?,0)			");
		
	
		try(PreparedStatement pstmt=conn.prepareStatement(sql.toString());
				){
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, "hong");
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getBoard_name());
			pstmt.executeUpdate();

		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void insertfile(Connection conn,BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}
	
}
