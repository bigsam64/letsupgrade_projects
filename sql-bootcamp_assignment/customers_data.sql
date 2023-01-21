CREATE DATABASE customers_data;

USE customers_data;

CREATE TABLE customers (

        Name VARCHAR (255) UNIQUE NOT NULL,

        Age INT (2) NOT NULL,

        Gender ENUM ("Male" , "Female"),

        Address VARCHAR (255) NOT NULL,

        Phone_number INT (15)
  );

INSERT INTO customers (Name , Age , Gender , Address , Phone_number)

VALUES ("John Doe" , "35" , "Male" , "123 Main St" , "555-555-5555"),

        ("Jane Smith" , "26" , "Female" , "456 Park Ave" , "555-555-5556"),

        ("Bob Johnson" , "42" , "Male" , "789 Elm Str" , "555-555-5557"),

        ("Samantha William" , "31" , "Female" , "321 Oak Str" , "555-555-5558"),

        ("Michael Brown" , "25" , "Male" , "159 Pine Str" , "555-555-5559"),

        ("Emily Davis" , "22" , "Female" , "753 Cedar Str" , "555-555-55560"),

        ("Joshua Garcia" , "32" , "Male" , "987 Birch Str" , "555-555-5561"),

        ("Ashley Martinez" , "24" , "Female" , "654 Spruce st" , "555-555-5562"),

        ("David Anderson" , "40" , "Male" , "135 Maple Str" , "555-555-5563"),

        ("Stephanie Thomas" , "27" , "Female" , "246 Willow Str" , "555-555-5564");

--Read function, which reads the entire data from the table

SELECT * FROM customers;

--update function which is used to update data in database

UPDATE customers

SET Phone_number = "555-555-5565"
WHERE Phone_number= "555-555-5564" OR Phone_number= "555-555-5563";

--delete function, actually deletes data from database depending on parameters specified
DELETE FROM customers
WHERE Gender= "F" ;
