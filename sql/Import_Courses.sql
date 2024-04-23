USE RateMyProfessor;
LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/courses_final_woName.csv'
INTO TABLE courses
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(course_name, course_code,campus_id,professor_id);
UPDATE courses
SET rating = (SELECT AVG(rating) FROM reviews WHERE course_id = courses.course_id);

