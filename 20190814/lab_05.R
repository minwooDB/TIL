#문제1 
exam1<-function(x,y){
 if(x>y){
   return(x-y)
  }else if(x<=y){
   return(y-x)
  }
}
#문제2
exam2<-function(x,y,z){
  if(y == "+"){
    result<- x+z
  }else if(y == "-"){
    result<- x-z
  }else if(y == "*"){
    result<- x*z
  }else if(y == "%/%"){
    if(x=0){
      result2<- '오류1'
      }else if(z=0){
      result2<- '오류2'
  }else{
    result2 <- x%/%y
  }
  }else if(y=='%%'){
    if(x==0){
      result2 <- '오류1'
    }else if(z==0){
      result2 <- '오류2'
    }else{
      result2 <- x%%z
    }
  }else{
    result2 <- "규격의 연산자만 전달하세요"
  }
  return(result2)
}

#문제3
f8<- function(x,deco2){
  if(is.numeric(x)&&x<0){
  for(i in 1:x){
    cat(deco2)
  }
  }
  }
f8(2,'deco2')

#문제4
exam4<- function(x){
  if(x>=85){
    grade<<-"상"
  }else if(x>=70){
    grade<<-"중"
  }else{ 
    grade<<-"하"
  }
  print(x,grade)
}
exam4(80)

#문제5
countEvenOdd<-function(x){
  if(is.vector(x)&&is.numericx){
  list1<-list(even=0,odd=0)
   for(i in i:length(list1)) 
   if(list[i]%%2 = 1){
     list1$odd<- list1$odd+1
   }
  else
    list$even<- list$even+1
  }
}
#문제6
vmSum <-function(vec2){
  if(!is.vector(ven2)){
    stop("벡터만 전달하숑!")
  }
  else if(!is.numeric(vec)){
  warning("숫자 벡터를 전달하숑!")
  return(0)
  }
  for(i in i:length[vec2]){
  sum<- sum+vec2[i]
  }
  return(sum)
}
#문제7
createVector <- function(x){
  x <- list(num=NULL,deco=NULL,log=NULL)
  if(is.numeric(x)){
    x$num<- x
  }else if(is.character(x)){
    x$deco <- x
  }else if(is.logical(x)){
    x$log <- x 
  }
  return(x)
  }

#문제8
test1 <- scan("iotest1.txt")
cat(" 오름차순 :",sort(test1),"\n"
    ,"내림차순 :",sort(test1,decreasing = T),"\n"
    ,"합 :",sum(test1),"\n"
    ,"평균 :",mean(test1),"\n")