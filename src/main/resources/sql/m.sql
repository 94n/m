SELECT *
FROM customers;

SELECT customername,
       city
FROM customers;

SELECT country
FROM customers;

SELECT DISTINCT country
FROM customers;

SELECT COUNT(DISTINCT country)
FROM customers;

SELECT COUNT(*) AS distinctcountries
FROM (
       SELECT DISTINCT country
       FROM customers
     );

SELECT *
FROM customers
WHERE country = 'Mexico';

SELECT *
FROM customers
WHERE customerid = 1;

SELECT *
FROM customers
WHERE city = 'Berlin';

SELECT *
FROM customers
WHERE country = 'Germany'
  AND city = 'Berlin';

SELECT *
FROM customers
WHERE city = 'Berlin'
   OR city = 'München';

SELECT *
FROM customers
WHERE country = 'Germany'
   OR country = 'Spain';

SELECT *
FROM customers
WHERE NOT country = 'Germany';

SELECT *
FROM customers
WHERE country = 'Germany'
  AND (
    city = 'Berlin'
    OR city = 'München'
  );

SELECT *
FROM customers
WHERE NOT country = 'Germany'
  AND NOT country = 'USA';

SELECT *
FROM customers
WHERE city = 'Berlin'
  AND postalcode = 12209;

SELECT *
FROM customers
ORDER BY country;

SELECT *
FROM customers
ORDER BY country DESC;

SELECT *
FROM customers
ORDER BY country,
         customername;

SELECT *
FROM customers
ORDER BY country ASC,
         customername DESC;

SELECT *
FROM customers
ORDER BY city;

INSERT INTO customers (customername,
                       contactname,
                       address,
                       city,
                       postalcode,
                       country)
VALUES ('Cardinal',
        'Tom B. Erichsen',
        'Skagen 21',
        'Stavanger',
        '4006',
        'Norway');

INSERT INTO customers (customername,
                       city,
                       country)
VALUES ('Cardinal',
        'Stavanger',
        'Norway');

INSERT INTO customers (customername,
                       address,
                       city,
                       postalcode,
                       country)
VALUES ('Hekkan Burger',
        'Gateveien 15',
        'Sandnes',
        '4306',
        'Norway');

SELECT customername,
       contactname,
       address
FROM customers
WHERE address IS NULL;

SELECT customername,
       contactname,
       address
FROM customers
WHERE address IS NOT NULL;

SELECT *
FROM customers
WHERE postalcode IS NULL;

UPDATE customers
SET contactname = 'Alfred Schmidt',
    city        = 'Frankfurt'
WHERE customerid = 1;

UPDATE customers
SET contactname = 'Juan'
WHERE country = 'Mexico';

UPDATE customers
SET contactname = 'Juan';

UPDATE customers
SET city = 'Oslo';

DELETE
FROM customers
WHERE customername = 'Alfreds Futterkiste';

DELETE
FROM Customers;

DELETE
FROM customers
WHERE country = 'Norway';

SELECT *
FROM customers
WHERE ROWNUM <= 3;

SELECT *
FROM customers
WHERE country = 'Germany'
  AND ROWNUM <= 3;

SELECT MIN(price) AS smallestprice
FROM products;

SELECT MAX(price) AS largestprice
FROM products;

SELECT MIN(price)
FROM products;

SELECT COUNT(productid)
FROM products;

SELECT AVG(price)
FROM products;

SELECT SUM(quantity)
FROM orderdetails;

SELECT COUNT(*)
FROM products
WHERE price = 18;

SELECT *
FROM customers
WHERE customername LIKE 'a%';

SELECT *
FROM customers
WHERE customername LIKE '%a';

SELECT *
FROM customers
WHERE customername LIKE '%or%';

SELECT *
FROM customers
WHERE customername LIKE '_r%';

SELECT *
FROM customers
WHERE customername LIKE 'a__%';

SELECT *
FROM customers
WHERE contactname LIKE 'a%o';

SELECT *
FROM customers
WHERE customername NOT LIKE 'a%';

SELECT *
FROM customers
WHERE city LIKE 'a%';