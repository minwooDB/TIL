#7-1
mpg<-mpg %>%mutate("합산연비변수"=highway+city)
#7-2
mpg<-mpg %>%mutate("평균연비변수"=합산연비변수/2)
#7-3
best<-mpg%>%select(model,평균연비변수)%>% arrange(desc(평균연비변수)) %>%head(3)
#7-4
mpg<-mpg %>%select(model,합산연비변수,평균연비변수) %>% arrange(desc(평균연비변수)) %>%head(3)

mpg1 <- as.data.frame(ggplot2::mpg)

#8-1
result8<-mpg1%>%group_by(class)%>%summarise(mean_cty=mean(cty)) 
#8-2
result8 %>%arrange(desc(mean_cty))
#8-3
result8_1<-mpg%>%group_by(manufacturer)%>%summarise(mean_hwy=mean(hwy))%>%arrange(desc(mean_hwy)) %>% head(3)
#8-4
result8_2<-mpg%>%filter(class=="compact")%>%group_by(manufacturer)%>%summarise(n_compact=n())%>%arrange(desc(n_compact))
#9
fuel1<-data.frame(fl=c("c","d","e","p","r"),price_f1=c(2.35,2.38,2.11,2.76,2.22),stringsAsFactors =F)
#9-1
mpg<-left_join(mpg,fuel1,by ="fl")
#9-2
mpg %>% select(model,fl,price_f1) %>% head(5)
#10-1
midwest<-as.data.frame(ggplot2::midwest)
midwest<-midwest %>%mutate('전체인구대비미성년인구백분율'=(poptotal-popadults)/poptotal*100)
#10-2
midwest %>%select(county,전체인구대비미성년인구백분율)%>% arrange(desc(전체인구대비미성년인구백분율)) %>%head(5)
#10-3
midwest<-midwest %>%mutate(ifelse(전체인구대비미성년인구백분율>=40,"large"),ifelse(전체인구대비미성년인구백분율<30,"small"),ifelse(전체인구대비미성년인구백분율<40&전체인구대비미성년인구백분율>=30,"middle"))

#11
mpg11 <- as.data.frame(ggplot2::mpg)
mpg11[c(65,124,131,153,212),"hwy"]<-NA
#11-1
mpg11 %>%filter(is.na(hwy))
mpg11 %>%filter(is.na(drv))
#11-2
mpg11%>%filter(!is.na(hwy))%>% select(drv,hwy) %>%group_by(drv)%>%summarise(mean_hwy=mean(hwy))%>%arrange(desc(mean_hwy)) %>% head(3) 
#12-1
library(ggplot2)
mpg12<- as.data.frame(ggplot2::mpg)
mpg12[c(10,14,58,93),"drv"]<-"k"
mpg12[c(29,43,129,203),"cty"]<-c(3,4,39,42)
table(mpg12$drv)
table(mpg12$cty)
mpg12$drv<- ifelse(mpg12$drv == "k",NA,mpg12$drv)
mpg12$cty<- ifelse(mpg12$cty%in%c(3,4,39,42),NA,mpg12$cty)
#12-2
boxplot(mpg$cty)
mpg12$cty<- ifelse(mpg12$cty>27,NA,mpg12$cty)
#12-3
mpg12<-mpg12%>% summarise(mean_cty=mean(cty))
