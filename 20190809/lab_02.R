#문제2
chars <-seq(10,38,2)
chars
m1 <- matrix(chars, nrow=3, ncol=5)
m2 <- m1+100
(m_max_v<-max(m1))
(m_min_v<-min(m1))
row_max<-apply(m1, 1, max)
col_max<-apply(m1, 2, max)
m1; m2; m_max_v; m_min_v; row_max; col_max

#문제6
num<-1:9
m1 <- matrix(num, nrow=3, ncol=3)
m1
#문제7
vec1 <- c(1,2,3)
vec2 <- c(4,5,6)
vec3 <- c(7,8,9)
m2 <- rbind(vec1,vec2,vec3)
m2
#문제8
rownames(m2) <- c("row1","row2","row3")
colnames(m2) <- c("col1","col2","col3")
m2
#문제9
alpha<-matrix(letters[1:6], nrow=2)
alpha2<-rbind(alpha, c('x','y', 'z'))
alpha3<-cbind(alpha, c('s', 'p'))
alpha; alpha2;alpha3