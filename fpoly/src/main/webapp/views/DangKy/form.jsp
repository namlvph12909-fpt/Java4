<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng ký</title>
</head>
<body>
<form action="/fpoly/dang-ky" method="post">
	Tên đăng nhập: <input name="username"><br>
	Mật khẩu: <input name="password" type="password"><br>
	Giới tính:
	<input name="gender" type="radio" value="true">Nam
	<input name="gender" type="radio" value="false">Nữ<br>
	<input name="married" type="checkbox">Đã có gia đình?<br>
	Quốc tịch: <select name="country">
	<option value="Việt Nam">Việt Nam</option>
	<option value="US">United States</option>
	</select><br>
	<input name="hobbies" type="checkbox" value="R">Đọc sách
	<input name="hobbies" type="checkbox" value="T">Du lịch
	<input name="hobbies" type="checkbox" value="M">Âm nhạc
	<input name="hobbies" type="checkbox" value="O">Khác<br>
	Ghi chú: <textarea name="notes" rows="3" cols="30"></textarea>
	<hr>
	<button>Đăng ký</button>
</form>
</body>
</html>