#문제1 
v1 <- 1:10
v2 <- v1*2
max_2 <-max(v2)
min_2 <-min(v2)
avg_2 <-mean(v2)
sum_2 <-sum(v2)
v3 <-v2[-5]
v1;v2;max_2;min_2;avg_2;sum_2;v3

#문제3
seq(1,10,2)
rep(1,5)
rep(1:3,3)
rep(1:4,each=2)

#문제4
v3 <- seq(1,10,3)
names(v3) <- LETTERS[1:4]
v3
#문제5
count <- sample(1:100,7)
count
week.korname <- c("일요일","월요일","화요일","수요일","목요일","금요일","토요일"
                  )
names(count) <- week.korname   
names(count)
count[1]
which.min(count)
which.max(count)
week.korname[which(count>50)]
