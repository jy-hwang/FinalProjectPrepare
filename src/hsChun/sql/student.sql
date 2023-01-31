/*
 다음 스크립트 전체를 실행하고
 STUDENT, SUBJECT, ENROL 테이블을 조회하고
 데이터가 잘 들어갔는지 확인하시오.
 */
 
alter session set "_ORACLE_SCRIPT"=true;

--새로운 사용자 계정 생성
create user finalproject identified by 1234;

--롤(Role)을 통한 권한 부여
grant connect, resource, unlimited tablespace to finalproject;

--drop table student;
create table student(
  stu_no char(9)
, stu_name varchar2(12)
, stu_dept varchar2(20)
, stu_year number(1)
, stu_class char(1)
, stu_gender char(1)
, stu_height number(5,2)
, stu_weight number(5,2)
, CONSTRAINT p_stu_no primary key (stu_no)
);

insert into student values('20093075', '옥한빛', '기계',    1, 'C', 'M', 177, 80);
insert into student values('20093088', '이태연', '기계',    1, 'C', 'F', 162, 50);
insert into student values('20093054', '유가인', '기계',    2, 'C', 'F', 154, 47);
insert into student values('20072088', '조민우', '전기전자', 1, 'C', 'M', 188, 90);
insert into student values('20062021', '심수정', '전기전자', 2, 'A', 'F', 168, 45);
insert into student values('20052003', '박희철', '전기전자', 3, 'B', 'M', null,63);
insert into student values('20061062', '김인중', '컴퓨터정보',1, 'B', 'M', 166, 67);
insert into student values('20061007', '진현무', '컴퓨터정보',2, 'C', 'M', 174, 64);
insert into student values('20071001', '김종헌', '컴퓨터정보',3, 'A', 'M', null,72);
insert into student values('20071025', '옥성우', '컴퓨터정보',4, 'A', 'F', 172, 63);
insert into student (stu_no, stu_name,stu_year ) values ('20221001','홍길동',1);
--drop table subject;
create table subject (
  sub_no char(3)
, sub_name varchar2(30)
, sub_prof varchar2(12)
, sub_year number(1)
, sub_dept varchar2(20)
, constraint p_sub_no primary key (sub_no)
);

insert into subject values('111', '데이터베이스',  '이재영', 2, '컴퓨터정보' );
insert into subject values('110', '자동제어',     '정순정', 2, '전기전자' );
insert into subject values('109', '자동화설계',   '박민영', 3, '기계' );
insert into subject values('101', '컴퓨터개론',   '강종영', 3, '컴퓨터정보' );
insert into subject values('102', '기계공작법',   '김태영', 1, '기계' );
insert into subject values('103', '기초전자실험',  '김유석', 1, '전기전자' );
insert into subject values('104', '시스템분석설계', '강석현', 3, '컴퓨터정보' );
insert into subject values('105', '기계요소설계',  '김명성', 1, '기계' );
insert into subject values('106', '전자회로실험',  '최영민', 3, '전기전자' );
insert into subject values('107', 'CAD응용실습',  '구봉규', 2, '기계' );
insert into subject values('108', '소프트웨어공학', '권민성', 1, '컴퓨터정보' );

select * from subject;

--drop table enrol;
create table enrol(
  sub_no char(3)
, stu_no char(9)
, enr_grade number(3)
, constraint p_course primary key(sub_no, stu_no)
);

insert into enrol values('101','20071001',80);
insert into enrol values('104','20071001',56);
insert into enrol values('106','20052003',72);
insert into enrol values('103','20072088',45);
insert into enrol values('101','20071025',65);
insert into enrol values('104','20071025',65);
insert into enrol values('108','20061062',81);
insert into enrol values('107','20093054',41);
insert into enrol values('102','20093075',66);
insert into enrol values('105','20093075',56);
insert into enrol values('102','20093088',61);
insert into enrol values('105','20093088',78);


----------------------------------------------------------------

--1. finalproject 계정에 student, subject, enrol 테이블을 추가하시오.
--2. student, subject, enrol 테이블을 테이블정의서로 작성하시오.
--3. starUML 프로그램을 이용하여 student, subject, enrol 테이블의 ERD를 작성하시오.
--4. 학과가 "전기전자" 가 아닌 학과의 학생들의 모든 정보를 검색하시오.
select * from student where not stu_dept='전기전자';

--5. "컴퓨터정보"과 학생 중 1학년 학생을 모두 검색하시오.
select * from student where stu_dept='컴퓨터정보' and stu_year=1;

--6. 성별이 여학생이며, 체중이 60 이하인 학생을 모두 검색하시오.
select * from student where stu_gender='F' and stu_weight<=60;

--7. '김' 씨 성을 가진 학생의 학번과 이름을 검색하시오.
select stu_no, stu_name from student where stu_name like '김%';

--8. 이름에 '인' 이 들어있는 학생의 이름을 검색하시오.
select stu_name from student where stu_name like '%인%';

--9. 1,3 학년 학생들의 모든 정보를 검색하시오.
select * from student where stu_year in(1, 3);

--10. 학생들의 학번 , 이름, 신장을 검색하라 (신장 기록이 없는 학생의 경우 '미기록' 으로 표현)
select stu_no, stu_name, nvl(to_char(stu_height), '미기록') from student;

--11. 전체 학생 중 키가 가장 큰 학생의 키를 검색하라
select max(stu_height) from student;

--12. 키가 가장 큰 학생의 이름을 검색하라
select stu_name from student where stu_height=(select max(stu_height) from student);

--13. 전체 학생 중 체중이 가장 작은 학생의 체중을 검색하라
select min(stu_weight) from student;

--14. 체중이 가장 작은 학생의 이름을 검색하라.
select stu_name from student where stu_weight=(select min(stu_weight) from student);

--15. 학과별 학년별 학생들의 평균체중을 검색하라.
select avg(stu_weight) from student group by stu_dept, stu_year;

--16. 학과별 학생들의 인원수를 인원수가 많은 순으로 검색하라.
select count(*) from student group by stu_dept order by count(*) desc;

--17. 학과별 학생들의 평균신장을 평균신장 순으로 검색하라.
select avg(stu_height) from student group by stu_dept order by avg(stu_height) desc;

--18. 학과별 학년별 학생의 체중 합을 많은 순으로 검색하라.
select sum(stu_weight) from student
group by stu_dept, stu_year order by sum(stu_weight) desc;

--19. 학과별 학생들의 평균신장을 평균신장이 높은 순으로 검색하라.
select avg(stu_height) from student group by stu_dept order by avg(stu_height) desc;

--20. 학과별 학생들의 신장평균이 175 이하인 학과를 신장평균이 낮은 순으로 검색하라.
select stu_dept from student group by stu_dept
having avg(stu_height)<=175 order by avg(stu_height);

--join 조인을 기술할 때는 표준방식을 사용하라.
--21. 학번, 이름, 과목명, 점수를 검색하라. (equi join을 사용할 것)
select e.stu_no, stu_name, sub_name, enr_grade
from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on e.sub_no=sb.sub_no;

--22. 과목명과 학번, 이름 , 점수를 검색하라.(equi join 을 사용할 것)
select sub_name, stu_no, stu_name, enr_grade
from student
inner join enrol using(stu_no)
inner join subject using(sub_no);

--23. 과목명과 학번, 이름, 점수를 검색하라( join ~ using 을 사용할 것)
select sub_name, stu_no, stu_name, enr_grade
from student
inner join enrol using(stu_no)
inner join subject using(sub_no);

--24. 점수가 70점 이상인 학생의 이름을 검색하라(inner join 을 사용할 것)
select stu_name from student s inner join enrol e on e.stu_no=s.stu_no
where enr_grade>=70;

--25. 점수가 70점 이하인 학생의 이름을 검색하라(join ~ using을 사용할 것)
select distinct stu_name from student inner join enrol using(stu_no)
where enr_grade<=70;

--26. 김인중 학생이 수강하는 과목명과 강의 교수를 검색하라(inner join 을 사용할 것)
select sub_name, sub_prof from subject sb
inner join enrol e on e.sub_no=sb.sub_no
inner join student s on s.stu_no=e.stu_no where stu_name='김인중';

--27. 조민우 학생이 수강하는 과목명과 강의 교수를 검색하라(join ~ using 을 사용할 것)
select sub_name, sub_prof from subject
inner join enrol using(sub_no)
inner join student using(stu_no) where stu_name='조민우';

--28. 위에서 사용한 조인을 equi join(inner join) , join~using 방식으로 모두 변환하시오.

--이하의 문제는 equi join , join~using  2가지 조인방식을 각각 써볼것
--29. 컴퓨터개론 수업을 수강하는 학생들의 학번과 이름을 검색하라
select stu_name, stu_no from student
inner join enrol using(stu_no)
inner join subject using(sub_no) where sub_name='컴퓨터개론';

select stu_name, e.stu_no from student s
inner join enrol e on s.stu_no=e.stu_no
inner join subject sb on sb.sub_no=e.sub_no where sub_name='컴퓨터개론';

--30. 시스템분석 설계나 소프트웨어 공학을 수강하는 학생들의 학번, 이름, 점수를 성적 순으로 검색하라.
select stu_no, stu_name, enr_grade from student
inner join enrol using(stu_no)
inner join subject using(sub_no)
where sub_name in('소프트웨어공학', '시스템분석설계');

select e.stu_no, stu_name, enr_grade from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on sb.sub_no=e.sub_no
where sub_name in('소프트웨어공학', '시스템분석설계');

--31. 학생의 이름과 점수를 검색하라.
select stu_name, sub_name, enr_grade from student
inner join enrol using(stu_no)
inner join subject using(sub_no);

select stu_name, sub_name, enr_grade from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on sb.sub_no=e.sub_no;

--32. 체중이 60 이상인 학생이 수강하는 과목의 과목명을 모두 검색하라
select distinct sub_name from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on sb.sub_no=e.sub_no where stu_weight>=60;

select distinct sub_name from student
inner join enrol using(stu_no)
inner join subject using(sub_no) where stu_weight>=60;

--33. 컴퓨터 정보과에 개설된 과목을 수강하는 모든 학생의 학번과 이름을 검색하라.
select distinct s.stu_no, stu_name from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on sb.sub_no=e.sub_no where sub_dept='컴퓨터정보';

select distinct stu_no, stu_name from student
inner join enrol using(stu_no)
inner join subject using(sub_no) where sub_dept='컴퓨터정보';

--34. 과목별 수강인원을 과목번호, 과목명과 함께 과목번호 순으로 검색하라.
select sub_no, sub_name, count(*) from student
inner join enrol using(stu_no)
inner join subject using(sub_no) group by sub_no, sub_name order by sub_no;

select e.sub_no, sub_name, count(*) from student s
inner join enrol e on e.stu_no=s.stu_no
inner join subject sb on sb.sub_no=e.sub_no group by e.sub_no, sub_name order by e.sub_no;