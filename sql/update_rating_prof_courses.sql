USE RateMyProfessor;
UPDATE courses
SET rating = (SELECT AVG(rating) FROM reviews WHERE course_id = courses.course_id);
UPDATE professors
SET rating = (SELECT AVG(rating)
FROM reviews
WHERE reviews.professor_id = professors.professor_id);