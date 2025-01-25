SELECT id,
CASE 
WHEN score <= 2 THEN 'Fail'
WHEN score < 6 THEN 'Supplementary'
ELSE 'Distinction'
END as result
FROM student
