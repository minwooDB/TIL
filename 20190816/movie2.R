site<- "https://movie.daum.net/moviedb/grade?movieId=121137&type=netizen&page="
movie.review <- NULL
for(i in 1:20) {
  url <- paste(site, i, sep="")
  text <- read_html(url,  encoding="UTF-8")
  text
  nodes <- html_nodes(text, ".emph_grade")
  grade <- html_text(nodes)
  nodes <- html_nodes(text, ".desc_review")
  html_text(nodes, trim=TRUE)
  page <- data.frame(grade, review)
  movie.review <- rbind(movie.review, page)
}
write.csv(movie.review, "daummovie2.csv")
