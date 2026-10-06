-- Problem 175: Combine Two Tables
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address 
ON Person.personId=Address.personId;

-- Problem 584: Find Customer Referee
SELECT name
FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;

-- Problem 182: Duplicate Emails
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email)>1;