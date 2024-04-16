CREATE TABLE campus (
    Campus_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE professors (
    professor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    Campus_id INT,
    FOREIGN KEY (Campus_id) REFERENCES Campus(Campus_id)
);

CREATE TABLE reviews (
    review_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    professor_id INT,
    rating INT NOT NULL,
    comment TEXT,
    date_posted TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (professor_id) REFERENCES Professors(professor_id)
);

CREATE TABLE courses(
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    course_code VARCHAR(255) NOT NULL,
    professor_id INT,
    FOREIGN KEY (professor_id) REFERENCES Professors(professor_id)
);