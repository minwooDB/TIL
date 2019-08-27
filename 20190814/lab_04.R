#문제26
L1<-list(
  name = "scott",
  sal = 3000)
result <- L1$sal*2
result
#문제27
L2 <- list("scott",seq(from=100,to=300,by=100))
L2
#문제28
 L3 <- list(c(3,5,7), c('A', 'B', 'C'))
 L3
 L3[[2]][1] <- c('Alpha')
 #문제29
 L4 <- list(alpha=0:4, beta=sqrt(1:5), gamma=log(1:5))
 (L4[[1]]+10)
#문제30
 L4<-list(math=list(95, 90), writing=list(90, 85), reading=list(85, 80))
 L4
 mean(unlist(L4))
#문제1
 grade <- sample(1:6,1)
 if(grade == 1|2|3){
   cat(grade,"학년은 저학년입니다.")
 }else{
   cat(grade,"학년은 고학년입니다.")
 }   
#문제2
  choice <- sample(1:5,1)
  cal <- switch(EXPR = choice,
                   '1'=300+50,
                   '2'=300-50,
                   '3'=300*50,
                   '4'=300/50,
                   '5'=300%%50)
  cat("결과값:",cal)
#문제3
  time <- 31250
  a<-time%/%3600
  b<-time%%3600%/%60
  c<-time%%3600%%60
  cat(a,"시간",b,"분",c,"초")
#문제4
  count <- sample(3:10,1)
  deco <- sample(1:3,1)
  result2 <- paste(result2,switch(EXPR=deco,"*","$","#"))
  if(i==count){
  print(result2)}
#문제5
score <- sample(1:100,1)
if(score>= 90){
  level<- "A등급"
}else if(score>=80){
  level<- "B등급"
}else if(score>=70){
  level<- "C등급"
}else if(score>=60){
  level<- "D등급"
}else {
  level<- "E등급"
}
cat(score,"점은",level,"등급입니다.")

#문제6
print(paste(LETTERS,letters,sep=""))
