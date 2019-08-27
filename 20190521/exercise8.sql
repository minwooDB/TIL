CREATE TABLE VISITOR(
 NAME  VARCHAR2(18),
 writedate  DATE,
 MEMO  VARCHAR2(180));

DESC VISITOR; 

INSERT INTO VISITOR(WRITEDATE)
            VALUES(SYSDATE);
            
INSERT INTO VISITOR(WRITEDATE)
            VALUES(TO_DATE('2017��12��25��', 'YYYY"��"MM"��"DD"��"'));

INSERT INTO VISITOR(WRITEDATE)
            VALUES(TO_DATE('1999�� 8�� 11��', 'YYYY"��"MM"��"DD"��"'));

CREATE TABLE MEMBER(
 M_ID  VARCHAR2(24) PRIMARY KEY,
 M_PWD  VARCHAR2(24) NOT NULL,
 name VARCHAR2(18) NOT NULL,
 JOINDATE DATE DEFAULT SYSDATE);

CREATE TABLE NEWS(
 id  NUMBER(8) PRIMARY KEY,
 WRITER  VARCHAR2(18),
 title VARCHAR2(120),
 CONTENT  VARCHAR2(900),
 WRITEDATE DATE,
 CNT NUMBER(8));

CREATE SEQUENCE NEWS_SEQ;

CREATE TABLE MEETING(
 id  NUMBER(8) PRIMARY KEY,
 NAME  VARCHAR2(18) ,
 TITLE  VARCHAR2(120),
 MEETINGDATE DATE);
 
 CREATE SEQUENCE MEETING_SEQ;
 
 CREATE TABLE IMGTEST(
 NAME VARCHAR2(18) PRIMARY KEY,
 IMGCONTENT  BLOB);