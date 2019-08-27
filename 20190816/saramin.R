url <- read_html("http://www.saramin.co.kr/zf_user/search?search_area=main&search_done=y&search_optional_item=n&searchType=default_mysearch&searchword=%EC%9E%90%EB%B0%94")
saramin <- htmlParse(url)
content<- xpathSApply(saramin,"//input[@id='check_java']", xmlValue); 
content <- gsub("[[:punct:][:cntrl:]]", "", content)
content <- trimws(content)
content<- xpathSApply(saramin,"//h2[@class='cnt_result']", xmlValue); 
content
content <- gsub("[[:punct:][:cntrl:]]", "", content)
content
content <- trimws(content)
content