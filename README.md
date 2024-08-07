
# jdbc-postgres_CRUD_Operations

This repository contains code for performing CRUD (Create, Read, Update, Delete) operations using JDBC (Java Database Connectivity) with PostgreSQL.




## Introduction

This project demonstrates how to connect a Java application to a PostgreSQL database using JDBC and perform basic CRUD operations. This includes inserting new records, reading existing records, updating records, and deleting records.


## Prerequisites
* Java Development Kit (JDK)
* PostgreSQL
* JDBC Driver for PostgreSQL
## Installation

Clone the repository:

```bash
  git clone https://github.com/yourusername/jdbc-postgres_CRUD_Operations.git

  cd jdbc-postgres_CRUD_Operations  
```
    
## Configuration
1. pom.xml Configuration

If you are using Maven Project to manage your project dependencies, add the PostgreSQL JDBC dependency in your pom.xml file:

<dependency>

    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.2.23</version>
</dependency>
   
   
2. Database Setup

Create a PostgreSQL database and a table.
CREATE DATABASE my-project;

CREATE TABLE student (
    id INTEGER,
    name VARCHAR,
    age INTEGER,
    gmail VARCHAR
);
