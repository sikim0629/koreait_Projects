
--메뉴 (커피, 차, 주스)
CREATE TABLE coffee(
cname VARCHAR(50)  PRIMARY KEY,
cdetail VARCHAR(1024),
ckcal VARCHAR(20), 
ccaffeine VARCHAR(20),
csugars VARCHAR(20)
)DEFAULT CHARSET=UTF8;

CREATE TABLE tea(
tname VARCHAR(50) PRIMARY KEY,
tdetail VARCHAR(1024),
tkcal VARCHAR(20),
tcaffeine VARCHAR(20),
tsugars VARCHAR(20)
)DEFAULT CHARSET=UTF8;

CREATE TABLE juice(
jname VARCHAR(50) PRIMARY KEY,
jdetail VARCHAR(1024),
jkcal VARCHAR(20),
jcaffeine VARCHAR(20),
jsugars VARCHAR(20)
)DEFAULT CHARSET=UTF8;

--회원
CREATE TABLE member(
id VARCHAR(32) PRIMARY KEY,
password VARCHAR(32),
name VARCHAR(32),
mail VARCHAR(32) UNIQUE,
regidate VARCHAR(32)
) DEFAULT CHARSET=utf8;

--게시판
CREATE TABLE board(
bid int(10) PRIMARY KEY AUTO_INCREMENT,
btitle VARCHAR(1024),
bcontent VARCHAR(2048),
bmember VARCHAR(32),
bfilename VARCHAR(1024),
bdate VARCHAR(32)
) DEFAULT CHARSET=utf8;