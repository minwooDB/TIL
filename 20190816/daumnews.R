http.standard <- GET('http://media.daum.net/ranking/popular/')
newstitle = html_nodes(read_html(http.standard), 'strong.tit_thumb a')
newstitle = html_text(newstitle)
newstitle <- newstitle[1:50]
newspapername  = html_nodes(read_html(http.standard), 'strong.tit_thumb span')
newspapername  = html_text(newspapername )
newspapername
newspapername <- newspapername[1:50]
page <- cbind(newspapername , newstitle)
write.csv(page, "daumnews.csv")
