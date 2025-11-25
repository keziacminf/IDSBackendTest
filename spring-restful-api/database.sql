CREATE DATABASE viewdb;

USE viewdb;

CREATE TABLE status_data (
    id BIGINT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

INSERT INTO status_data (id,name) VALUES (0,'SUCCESS'), (1,'FAILED');

CREATE TABLE transaction_data (
    id BIGINT PRIMARY KEY,
    productID VARCHAR(50),
    productName VARCHAR(100),
    amount VARCHAR(20),
    customerName VARCHAR(100),
    status BIGINT,
    transactionDate DATETIME,
    createBy VARCHAR(50),
    createOn DATETIME,
    FOREIGN KEY (status) REFERENCES status_data(id)
);

-- Transaction Data
INSERT INTO transaction_data
(id, productID, productName, amount, customerName, status, transactionDate, createBy, createOn)
VALUES
(1372, '10001', 'Test 1', '1000', 'abc', 0, '2022-07-10 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1373, '10002', 'Test 2', '2000', 'abc', 0, '2022-07-11 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1374, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 12:14:52', 'abc', '2022-07-10 12:14:52'),
(1375, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-10 13:10:52', 'abc', '2022-07-10 13:10:52'),
(1376, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 13:11:52', 'abc', '2022-07-10 13:11:52'),
(1377, '10002', 'Test 2', '2000', 'abc', 0, '2022-08-12 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1378, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-12 14:11:52', 'abc', '2022-07-10 14:11:52'),
(1379, '10002', 'Test 2', '1000', 'abc', 1, '2022-09-13 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1380, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-13 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1381, '10002', 'Test 2', '2000', 'abc', 0, '2022-09-14 09:11:52', 'abc', '2022-07-10 09:11:52'),
(1382, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-14 10:14:52', 'abc', '2022-07-10 10:14:52'),
(1383, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-15 13:14:52', 'abc', '2022-07-10 13:14:52');