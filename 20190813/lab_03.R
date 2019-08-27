#문제 10
a <- array(1:24, dim=c(2,3,4))
a[2,,]
a[,1,]
a[,,3]
a+100 
a[,,4]*100
a[1,c(2,3),]
a[2,,2] <- a[2,,2]+100
a[,,1]  <- a[,,1]-2
a <- a*10
a <- NULL
a
#문제11
x <- c(1,2,3,4)
Y <- c(5,6,7,8)
df1 <- data.frame(x,Y)

#문제12
col1 <- c(1,2,3,4,5)
col2 <- c('a','b','c','d','e')
col3 <- c(6,7,8,9,10)
df2 <- data.frame(col1,col2,col3)
df2
#문제13
df3 <- data.frame(
  제품명=c("사과","딸기","수박"), 가격=c(1800, 1500, 3000), 
  판매량=c(24,38,13))
df3

#문제14
sum(df3$판매량)/3     
sum(df3$가격)/3

#문제15
name <- c(“Potter”, “Elsa”, “Gates”, “Wendy”, “Ben”)
gender <- factor(c(“M”, “F”, “M”, “F”, “M”))
math <- c(85, 76, 99, 88, 40)
df4 <- data.frame(name,gender,math,stringsAsFactors =F)

#문제16
str(emp)
#문제17
emp[c(3,4,5),]
#문제18
emp["ename"]
#문제19
emp[c("ename","sal")]
#문제20
emp[emp$job=="SALESMAN",]
#문제21
subset(emp, select=c("ename","sal","deptno"), subset = sal>= 1000 & sal <=3000)

#문제22
emp[emp$job == "ANALYST", c("ename","job","deptno")]
#문제23
emp[emp$job == "SALESMAN" , c("ename","job")]
#문제24
subset(emp, select = c("ename","comm"), subset= is.na(emp$comm))
#뮨제25
emp[order(emp$sal),]
