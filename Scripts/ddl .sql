select user(), database();

show tables;
select * from department;
-- 직책
DROP TABLE IF EXISTS erp_practice.Title RESTRICT;

-- 부서
DROP TABLE IF EXISTS erp_practice.department RESTRICT;

-- 사원
DROP TABLE IF EXISTS erp_practice.employee RESTRICT;

-- 세부정보
DROP TABLE IF EXISTS erp_practice.emp_detail RESTRICT;

-- 내 스키마
DROP SCHEMA IF EXISTS erp_practice;

-- 내 스키마
CREATE SCHEMA erp_practice;

-- 직책
CREATE TABLE erp_practice.Title (
	tno   INT         NOT NULL COMMENT '직책코드', -- 직책코드
	tname VARCHAR(20) NOT NULL COMMENT '직책명' -- 직책명
)
COMMENT '직책';

-- 직책
ALTER TABLE erp_practice.Title
	ADD CONSTRAINT PK_Title -- 직책 기본키
		PRIMARY KEY (
			tno -- 직책코드
		);

-- 부서
CREATE TABLE erp_practice.department (
	deptNo   INT         NOT NULL COMMENT '부서번호', -- 부서번호
	deptName VARCHAR(20) NOT NULL COMMENT '부서명', -- 부서명
	floor    INT         NULL     COMMENT '위치' -- 위치
)
COMMENT '부서';

-- 부서
ALTER TABLE erp_practice.department
	ADD CONSTRAINT PK_department -- 부서 기본키
		PRIMARY KEY (
			deptNo -- 부서번호
		);

-- 사원
CREATE TABLE erp_practice.employee (
	empno   INT         NOT NULL COMMENT '사원번호', -- 사원번호
	empname VARCHAR(20) NOT NULL COMMENT '사원명', -- 사원명
	title   INT         NULL     COMMENT '직책', -- 직책
	manager INT         NULL     COMMENT '직속상사', -- 직속상사
	salary  INT         NULL     COMMENT '급여', -- 급여
	dept    INT         NULL     COMMENT '부서' -- 부서
)
COMMENT '사원';

-- 사원
ALTER TABLE erp_practice.employee
	ADD CONSTRAINT PK_employee -- 사원 기본키
		PRIMARY KEY (
			empno -- 사원번호
		);

-- 세부정보
CREATE TABLE erp_practice.emp_detail (
	empno    INT        NOT NULL COMMENT '사원번호', -- 사원번호
	password CHAR(41)   NULL     COMMENT '비밀번호', -- 비밀번호
	pic      LONGBLOB   NULL     COMMENT '증명사진', -- 증명사진
	gender   TINYINT(1) NULL     COMMENT '성별', -- 성별
	hiredate DATETIME   NULL     COMMENT '입사일' -- 입사일
)
COMMENT '세부정보';

-- 세부정보
ALTER TABLE erp_practice.emp_detail
	ADD CONSTRAINT PK_emp_detail -- 세부정보 기본키
		PRIMARY KEY (
			empno -- 사원번호
		);

-- 사원
ALTER TABLE erp_practice.employee
	ADD CONSTRAINT FK_Title_TO_employee -- 직책 -> 사원
		FOREIGN KEY (
			title -- 직책
		)
		REFERENCES erp_practice.Title ( -- 직책
			tno -- 직책코드
		);

-- 사원
ALTER TABLE erp_practice.employee
	ADD CONSTRAINT FK_employee_TO_employee -- 사원 -> 사원
		FOREIGN KEY (
			manager -- 직속상사
		)
		REFERENCES erp_practice.employee ( -- 사원
			empno -- 사원번호
		);

-- 사원
ALTER TABLE erp_practice.employee
	ADD CONSTRAINT FK_department_TO_employee -- 부서 -> 사원
		FOREIGN KEY (
			dept -- 부서
		)
		REFERENCES erp_practice.department ( -- 부서
			deptNo -- 부서번호
		);

-- 세부정보
ALTER TABLE erp_practice.emp_detail
	ADD CONSTRAINT FK_employee_TO_emp_detail -- 사원 -> 세부정보
		FOREIGN KEY (
			empno -- 사원번호
		)
		REFERENCES erp_practice.employee ( -- 사원
			empno -- 사원번호
		);