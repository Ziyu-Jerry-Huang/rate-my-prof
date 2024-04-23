USE RateMyProfessor;
LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/Comments_final_matched.csv'
    INTO TABLE reviews
    FIELDS TERMINATED BY ','
    LINES TERMINATED BY '\n'
    IGNORE 1 ROWS
    (course_id,professor_id,rating,comment);
