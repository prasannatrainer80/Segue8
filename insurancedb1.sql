drop database if exists insurancenew;
create database insurancenew;
use insurancenew;
Create Table PolicyDetails
(
    PolicyId varchar(10) primary key,
    PolicyName varchar(30),
    PolicyType varchar(30),
    PremiumAmount DOUBLE,
    PayMode varchar(10),
    Term varchar(30),
    InstallmentAmountPerPayMode double,
    MaturedAmount double
);
INSERT INTO PolicyDetails VALUES("P001","vidyachethana","Education insurance",500000,"QUARTERLY","2years",65200,1300000);
INSERT INTO PolicyDetails VALUES("P002","ArogyaBhagya","Health insurance",100000,"HalfYearly","3years",16666,390000);



CREATE TABLE AgentLogin (
    Username varchar(50) primary key,
    Password varchar(50) NOT NULL
);
Insert into AgentLogin values('Admin','Admin@123');



Create table CustomerDetails
(
CustomerId varchar(10) PRIMARY KEY ,
CustomerName CHAR(20) NOT NULL,
CustomerDesignation CHAR(20) NOT NULL,
CustomerEmail CHAR(20) NOT NULL,
CustomerAddress CHAR(30) NOT NULL,
CustomerContact BIGINT NOT NULL,
PassWord varchar(20)
);
INSERT into  CustomerDetails  VALUES("C001",'Swathi','SDE','swati@gmail.com','bangalore',887643568,'Swathi@123');
INSERT into  CustomerDetails  VALUES("C002",'javed','Engineer','javid@gmail.com','UP',9876543241,'javed@123');
INSERT into  CustomerDetails  VALUES("C003",'HariPriya','Developer','HP@gmail.com','AndhaPradhesh',7654323198,'Hari@123');



Create Table BookingDetails
(
  BookingId varchar(10) primary key,
CustomerId varchar(10),
  PolicyID varchar(30) ,
  PayMode varchar(10),
  BookingDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  ExpiryDate Date,
  Status ENUM('INACTIVE','ACTIVE','LAPSED') default 'ACTIVE',
  foreign key(CustomerId) references CustomerDetails(CustomerId) ,
  foreign key(PolicyId) references PolicyDetails(PolicyId)
);
INSERT into  BookingDetails  VALUES("B001","C001",'P001',"QUARTERLY","2022-01-01","2024-01-01","ACTIVE");
INSERT into  BookingDetails  VALUES("B002","C002",'P002',"HalfYearly","2022-01-01","2025-01-01","ACTIVE");



Create Table PaymentDetails
(
  PaymentntId varchar(10) primary key,
  BookingId varchar(10) references BookingDetails(BookingId),
CustomerId varchar(10)references CustomerDetails(CustomerId) ,
  PolicyID varchar(30) references PolicyDetails(PolicyId),
  AmountLeftInTerm double,
  -- amount left to pay
  TotalAmountToPayInEveryMode double,
  PayAmount double,
  Fine double,
  PaymentDate  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  NextDayPayment TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Insert into PaymentDetails values("Q001","B001","C001","P001",434800,65200,65200,0,"2022-11-04","2023-02-04");


Create Table lapsedpolicies
(
  LapsedId varchar(10) primary key,
  BookingID varchar(10),
  lapsedStatus varchar(10),
  RefundAmount double
);


