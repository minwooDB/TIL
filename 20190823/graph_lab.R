#문제1
mpg <- as.data.frame(ggplot2::mpg)
plot(mpg$cty, mpg$hwy, xlab="도시연비", ylab="고속도로연비",  xlim=c(0, 
                                                               40), ylim=c(0, 45),pch=c(3)) 
#문제2
mpg2<-mpg %>%select(drv) %>%group_by(drv) 
barplot(table(mpg2),col=c("red","green","blue"))

#문제3
install.packages("RColorBrewer")
library(RColorBrewer)
boxplot(hwy~manufacturer,ylim=c(5,40),data=mpg, xlab="" , ylab="고속도로연비",las = 2,col=heat.colors(15))
title(main="*제조사별 고속도로 그래프*",col.main="hotpink", font.main=4) 
coldens<-seq(from=10,to=40,by=5)
