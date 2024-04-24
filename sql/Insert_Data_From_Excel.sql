USE RateMyProfessor;
LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/Professor.csv'
INTO TABLE professors
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(name, campus_id);

LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/Comments_final_matched.csv'
INTO TABLE reviews
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(course_id,professor_id,rating,comment,date_posted);

LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/courses_final_woName.csv'
INTO TABLE courses
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(course_name, course_code,campus_id,professor_id);