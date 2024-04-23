USE RateMyProfessor;
LOAD DATA LOCAL INFILE '/Users/xinruiyi/Documents/GitHub/rate-my-prof/csv/Professor.csv'
INTO TABLE professors
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(name, campus_id);