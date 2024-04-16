CREATE TABLE Campus (
    Campus_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Professors (
    professor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    Campus_id INT,
    FOREIGN KEY (Campus_id) REFERENCES Campus(Campus_id)
);

CREATE TABLE Reviews (
    review_id INT AUTO_INCREMENT PRIMARY KEY,
    professor_id INT,
    rating INT NOT NULL,
    comment TEXT,
    date_posted TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    anonymous BOOLEAN NOT NULL DEFAULT TRUE,
    FOREIGN KEY (professor_id) REFERENCES Professors(professor_id)
);