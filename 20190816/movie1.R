#실습
url <- "https://movie.daum.net/moviedb/grade?movieId=121137&type=netizen"
text <- read_html(url,  encoding="UTF-8")
text
nodes <- html_nodes(text, ".emph_grade")
grade <- html_text(nodes)
nodes <- html_nodes(text, ".desc_review")
review <- gsub("\t", "", review);
review <- gsub("\n", "", review);
review <- gsub("\r", "", review);
html_text(nodes, trim=TRUE)
page <- data.frame(grade, review)
write.csv(page, "daummovie1.csv")
