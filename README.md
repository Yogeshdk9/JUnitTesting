# cafecoffeeshop
coffee shop billing system written in java and mysql as database

# Requirements
1) Java 8 or higher
2) Eclipse or any other Java ide
3) mysql server & mysql workbench

# Setup
1)Clone/Download project

$ git clone https://github.com/yogeshpendse/cafecoffeeshop.git

Import it to Eclipse

2)Setup database


$ mysql -u user -p -h hostname;

mysql> create database cafe;

mysql> use cafe;

mysql> source cafe.sql;


3)Run BillingApp.java

# Note
cafe is the schema name used in the codebase.

So, if you want to give your own schema name, then you need to provide that name is cafe.properties also.

This project has few dependencies:

jasypt


jdbc-connector


The above libraries have been provided in the lib directory
