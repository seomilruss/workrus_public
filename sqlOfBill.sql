/*
   Check of your Database!
   this query it's Mysql DataBase.

   CREATE DATABASE basic_calc;
   DROP DATABASE basic_calc;
   DROP TABLE bill_value;
   USE basic_calc;
*/
 
CREATE TABLE bill_value (
   cash INT(100),
   total INT(100),
   tax double(100),
   change INT(100)
);

SELECT * FROM bill_value;