<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="">
		<div>
			<h3>게시판 글쓰기</h3>
		</div>
		<div>
			<select>
				<option>게시판을 선택해주세요</option>
				<option>도서</option>
				<option>여행</option>
				<option>영화</option>
			</select> <input type="file" name="put_file">
		</div>
		<div>
			<input type="text" name="write_title" placeholder="제목을 입력해주세요">
		</div>
		<div>
			<textarea rows="10" cols="30" placeholder="내용을 입력해주세요"></textarea>
		</div>
		<input type="submit" value="등록">
		<input type="reset"	value="취소">
	</form>
</body>
</html>