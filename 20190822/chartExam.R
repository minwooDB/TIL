#문제1
(click <- read.table("product_click.log", header=TRUE))
click<-click %>%select(date="X201612120944",pnum="p001")
click_num<-click %>%group_by(pnum)%>%summarise(n_click=n()) %>%arrange(pnum)
barplot(click_num$n_click)
xname <- click_num$pnum 
coldens <- seq(from=0, to=1000, by=100)
barplot(click_num$n_click, main="세로바그래프실습", xlab="상품ID", ylab="클릭수", 
        col=terrain.colors(15), density=coldens, names.arg=xname)
png(filename="clicklog1.png", height=400, width=700, bg="white")
#문제2

click$date<-str_sub(click$date,start=-4)
click$date<-str_sub(click$date,start=1,end=2)
click<-click %>%select(date)%>% group_by(date)%>%summarise(n_click=n())

pie(click$n_click, labels=paste(click$date, "-", as.numeric(click$date)+1),main="파이그래프실습", col=rainbow(18))
png(filename="clicklog2.png", height=400, width=700, bg="white")
