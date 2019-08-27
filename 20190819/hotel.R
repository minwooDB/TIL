# 아고다 호텔 댓글
remDr <-remoteDriver(remoteServerAddr = "localhost" , port=4445, browserName = "chrome")
remDr$open()
remDr$navigate("https://www.agoda.com/ko-kr/shilla-stay-seocho/hotel/seoul-kr.html?cid=-204")
more<-remDr$findElements(using='css','#SearchBoxContainer > div > div > div.Popup__container.Popup__container--garage-door > div > div > div.AlertMessage.CalendarAlertMessage > a')
sapply(more,function(x){x$clickElement()})
remDr$executeScript("scrollBy(0,7500)")
mored <- remDr$findElements(using ="css", '#dismiss-btn > p')
sapply(mored,function(x){x$clickElement()})
reple = NULL;
repl_v = NULL;
for(i in 1:15){
  if(i>3) i=4;
  nextCss <- paste("#reviewSection > div:nth-child(4) > div > span.Review-paginator-numbers > span:nth-child(",i,")", sep="")                
  nextPage<-remDr$findElements(using='css',nextCss)
  sapply(nextPage,function(x){x$clickElement()})
  Sys.sleep(1)
  doms1<-remDr$findElements(using='css','.Review-comment-bodyText')
  reple <-sapply(doms1, function (x) {x$getElementText()})
  repl_v <- c(repl_v, unlist(reple))
}
print(repl_v)
write(repl_v, "hotel.txt")
num = NULL
nums = NULL
for(i in 1:10){
  if(i>2) i=11;
  num<- i
  nums<-c(nums,num)
}
print(nums)
