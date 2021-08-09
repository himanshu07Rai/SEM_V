### Data : Any raw / Unprocessed fact.

- Ex: 20,Dehradun,Himanshu.

### Information : Processed data.

* Ex: Himanshu is 20 years old and lives in Dehradun.

### Database : Collection of related data.

### Meta-data : Description of the database. The database definition.

#  DBMS : 

Collection of programs that enables users to create and maintain the database.

## Functionalities

- ### Define DB : Specifying the data type, structure and constraints for the data to be stored.

- ### Construct DB : Process of storing data.

- ### Manipulate DB : Querying the database to retrieve specific data, updating database and generating reports.

- ### Share DB : Allows multiple users and programs to access the database concurrently. 



## Properties

- A database represents some aspects of the real word.
- A database is logically coherent collection of data with some inherent meaning.
- A database is designed  built and populated with data for a specific purpose.

## DB System Environment

![image-20210721154547003](Images/DB_System_Environment.jpg)



## Data Model

A Database model defines the logical design and structure of a database and defines how data will be stored, accessed and updated in a database management system.

A data model is a diagram that displays a set of tables and the relationships between them. This helps us in understanding he purpose of the table as well as their dependencies.

## Data Modelling

**Data modeling** is the process of creating a data model for the data to be stored in a database.

Data modelling has three main stages : 

1. **Conceptual Data Model** : 

   * Set of squares connected by lines
   * squares = entities, lines = relationship b/w entities
   * Highly abstract ( not too much details )
   * Easily understood
   * Only entities are visible
   * Abstract Relationships ( column, through which the relationship between entities is established, is not given )
   * No software tool is required to define this model

   ### **Once conceptual model is finalized, it is elaborated into logical model**

2. **Logical Data Model** : 

   * Attributes are present for each entity.
   * Attributes are further identified as key ( define uniqueness of entity ) and not key attributes
   * Primary key - Foreign key relationships are clearly defined
   * Has user friendly Attributes names
   * Designed and developed independently from the DBMS.
     * Limitations or features of a particular DBMS is not considered
   * Bit more efforts required to enhance , in comparison to Conceptual Model
   * Data Modelling tools can be used to create logical data models.

   

3. **Physical Data Model** : 

   * Here, logical design is adopted to a particular DBMS.
     * The design can change slightly to fit into the limitations of a DBMS or to take advantages of DBMS specific feature.
   * Entities are referred as tables
   * Attributes are referred to as columns
   * Database compatible table and column names
   * Database specific data types are introduced
   * Significantly more efforts required to enhance in comparison to logical model
   * Will include indexes. constraints, triggers and other DB objects.
   * Specific to a database
   * Difficult to port to a different database , once design is finalized





## Attributes

Attributes are the descriptive properties which are owned by each entity

## Types : 

![image](https://user-images.githubusercontent.com/64080063/128636428-899caa2f-87eb-4229-bb55-d27c2308a21e.png)



1. **Simple Attributes** :  Simple attributes are those attributes which can not be divided further.

<img src="https://user-images.githubusercontent.com/64080063/128636468-b85042c6-9d19-4b09-84c8-62e48685ddd8.png" alt="image" style="zoom: 150%;" />



2. **Composite Attributes** : Composite attributes are those attributes which are composed of many other simple attributes.

![image](https://user-images.githubusercontent.com/64080063/128636536-3406e05e-8ff2-4cfa-aea7-b49ade399f17.png)



3. **Single Valued Attributes** : Single valued attributes are those attributes which can take only one value for a given entity

<img src="https://user-images.githubusercontent.com/64080063/128636613-d93da5a4-8b86-42a6-8a7d-689456b71add.png" alt="image" style="zoom:150%;" />



4. **Multi Valued Attributes** : Multi valued attributes are those attributes which can take more than one value for a given entity

<img src="https://user-images.githubusercontent.com/64080063/128636672-4b84c766-cacf-4bb0-a395-975bdbf85ba6.png" alt="image" style="zoom:150%;" />



5. **Derived Attributes** : Derived attributes are those attributes which can be derived from other attribute(s).

<img src="https://user-images.githubusercontent.com/64080063/128636797-05b8d7c9-5aea-4e74-8770-2bbb60ccc324.png" alt="image" style="zoom:150%;" />



6. **Key Attributes** : Key attributes are those attributes which can identify an entity uniquely. ( Primary/Candidate Keys )

<img src="https://user-images.githubusercontent.com/64080063/128636825-3601acbe-d6c2-4038-bdb9-9f0ea6efb803.png" alt="image" style="zoom:150%;" />



7. **Complex Attributes** :  If an attribute is made using the multi valued attributes and composite attributes then it is known as complex attribute.

   *  A person can have more than one residence; each residence can have more than one phone.

   

8. **Non-Key Attributes** : Excluding the candidate key attributes in an entity set are the non key attributes.

9. **Stored Attributes:** Attribute that cannot be derived from other attributes are called as stored attribute.

   * Roll_no, Gender



## Relationships

Database relationships are associations between tables

These are created using join statements to retrieve data.

**Degree** : The degree of a relationship is the number of entity types that participate(associate) in a relationship.

Based on the number of entity types that are connected we have the following degree of relationships:

- **Unary** : A unary relationship exists when both the participating entity type are the same.

![image](https://user-images.githubusercontent.com/64080063/128659469-144cef16-0db6-499f-809f-8f6d64002287.png)



- **Binary** : A binary relationship exists when exactly two entity type participates.

![image](https://user-images.githubusercontent.com/64080063/128659567-8af4d746-68eb-4220-9fba-765fde36abe3.png)



- **Ternary** : A ternary relationship exists when exactly three entity type participates.

![image](https://user-images.githubusercontent.com/64080063/128659599-d0ce23f2-32f1-4be4-9210-7663c9671aa4.png)



- **N-ary** : An N-ary relationship exists when ‘n’ number of entities are participating.

![image](https://user-images.githubusercontent.com/64080063/128659621-61987e84-7c1b-4fca-b5f4-9a6b4f7af8d1.png)





**Cardinality** : Cardinality defines how many instances of one entity are related to instances of another entity. It describes a fundamental relationship between two entities or objects.

**Types** : 

1. **One-to-One Relationship** : Such a relationship exists when each record of one table is related to only one record of the other table.

![img](https://s3.ap-south-1.amazonaws.com/afteracademy-server-uploads/what-are-the-different-types-of-relationships-in-dbms-one-to-one-relationship-example-e89f4cf71cbaee76.jpg)



2. **One-to-Many or Many-to-One Relationship** : Such a relationship exists when each record of one table can be related to one or more than one record of the other table. 

![img](https://s3.ap-south-1.amazonaws.com/afteracademy-server-uploads/what-are-the-different-types-of-relationships-in-dbms-one-to-many-relationship-example-0d5c065e28b4f23a.jpg)

We can say that each Customer is associated with many Account. So, it is a one-to-many relationship. But, if we see it the other way i.e many Account is associated with one Customer then we can say that it is a many-to-one relationship.



3. **Many-to-Many Relationship** : Such a relationship exists when each record of the first table can be related to one or more than one record of the second table and a single record of the second table can be related to one or more than one record of the first table.

![img](https://s3.ap-south-1.amazonaws.com/afteracademy-server-uploads/what-are-the-different-types-of-relationships-in-dbms-many-to-many-relationship-example-bd4be3b525b7bdcd.jpg)

Each customer can buy more than one product and a product can be bought by many different customers.



![img](https://s3.ap-south-1.amazonaws.com/afteracademy-server-uploads/what-are-the-different-types-of-relationships-in-dbms-many-to-many-relationship-examples-c961b29d4c8aa6a5.jpg)



**Participation Constraints** : 

* **Partial Participation** :  Partial Participation exists when all the entity of an entity type is not associated with one or the other entity of another entity type.

![img](https://www.gatevidyalay.com/wp-content/uploads/2018/05/Participation-in-DBMS-Example.png)



* **Total Participation** : Total Participation exists when all the entity of an entity type is associated with one or the other entity of another entity type.

![img](https://www.gatevidyalay.com/wp-content/uploads/2018/05/Participation-in-DBMS-Example.png)



Minimum cardinality tells whether the participation is partial or total.

- If minimum cardinality = 0, then it signifies partial participation.
- If minimum cardinality = 1, then it signifies total participation.

Maximum cardinality tells the maximum number of entities that participates in a relationship set.





## Weak Entity and Strong Entity in DBMS 

The entity defines the **type of data stored**, simply it is nothing but a database table . We have the following two types of entities based on Unique Identification –

1. Strong entity
2. Weak entity

#### **Strong entity** 

- A `strong entity` set is an entity that contains sufficient attributes to uniquely identify all its entities 
-  Simply strong entity is nothing but an entity set having a primary key attribute or a table which consists of a primary key column
- The **primary key of the strong entity** is represented by **underlining it** 

##### Representation 

- - The **strong entity** is represented by a **single rectangle**. 
  - **Relationship between two strong entities** is represented by a **single diamond.**

![Strong Entity in DBMS](https://prepinsta.com/wp-content/uploads/2021/04/Strong.webp)



#### **Weak entity** 

- Weak entity is dependent on strong entity and cannot exists without a corresponding strong. 
- It has a foreign key which relates it to a strong entity. 
- A weak entity is represented by double rectangle. Relationship between a strong entity and a weak entity is represented by double diamond. 
- The foreign key is also called a `partial discriminator` key.



##### Example for weak entity  

- - In the ER diagram, we have **two entities building and apartment**
  - **Building is a strong entity** because it has a **primary key** attribute called building number which is capable of uniquely identifying all the flats present in the apartment 
  - Unlike building, **apartment is weak entity** because it **does not have any primary key and door number here acts only as a discriminator** because door number cannot be used as a primary key, there might be multiple flats in the building with the same door number or on different floors.



| Sr. No. |             Key             | Strong Entity                                                | Weak Entity                                                  |
| ------- | :-------------------------: | :----------------------------------------------------------- | :----------------------------------------------------------- |
| 1       |             Key             | Strong entity always have one primary key.                   | Weak entity have a foreign key referencing primary key of strong entity. |
| 2       |         Dependency          | Strong entity is independent of other entities.              | Weak entity is dependent on strong entity.                   |
| 3       |       Represented by        | A strong entity is represented by single rectangle.          | A weak entity is represented by double rectangle.            |
| 4       | Relationship Representation | Relationship between two strong entities is represented by single diamond. | Relationship between a strong and weak entity is represented by double diamond. |
| 5       |        Participation        | Strong entity may or may not participate in entity relationships. | Weak entity always participates in entity relationships.     |





## Relational Model : 

* The relational model sorts data into tables, also known as relations, each of which consists of columns and rows.
* Each column lists an attribute of the entity.
* Together, the attributes in a relation are called a domain.
* A particular attribute or combination of attributes is chosen as a primary key that can be referred to in other tables, when it’s called a foreign key.
* Each row, also called a tuple, includes data about a specific instance of the entity.
* The model also accounts for the types of relationships between those tables, including one-to-one, one-to-many, and many-to-many relationships. 

![relational model](https://d2slcw3kip6qmk.cloudfront.net/marketing/pages/chart/seo/database/discovery/relational-model.svg)

**Relational databases are typically written in Structured Query Language (SQL). The model was introduced by E.F. Codd in 1970.**



## Relational Model Concepts

1. **Attribute:** Each column in a Table. Attributes are the properties which define a relation. e.g., Student_Rollno, NAME,etc.
2. **Tables** – In the Relational model the, relations are saved in the table format. It is stored along with its entities. A table has two properties rows and columns. Rows represent records and columns represent attributes.
3. **Tuple** – It is nothing but a single row of a table, which contains a single record.
4. **Relation Schema:** A relation schema represents the name of the relation with its attributes.
5. **Degree:** The total number of attributes which in the relation is called the degree of the relation.
6. **Cardinality:** Total number of rows present in the Table.
7. **Column:** The column represents the set of values for a specific attribute.
8. **Relation instance** – Relation instance is a finite set of tuples in the RDBMS system. Relation instances never have duplicate tuples.
9. **Relation key** - Every row has one, two or multiple attributes, which is called relation key.
10. **Attribute domain** – Every attribute has some pre-defined value and scope which is known as attribute domain

[![img](https://cdn.guru99.com/images/1/091318_0803_RelationalD1.png)](https://cdn.guru99.com/images/1/091318_0803_RelationalD1.png)



## Constraints of RDBMS

- Relational constraints are the restrictions imposed on the database contents and operations.
- They ensure the correctness of data in the database.

![img](https://www.gatevidyalay.com/wp-content/uploads/2018/05/Constraints-in-DBMS.png)



### **Domain Constraint-**

* Domain constraint defines the domain or set of values for an attribute.

- It specifies that the value taken by the attribute must be the atomic value from its domain.



**Tuple Uniqueness Constraints**: 

* Tuple Uniqueness constraint specifies that all the tuples must be necessarily unique in any relation.



**Key Constraints** : 

* All the values of primary key must be unique.
* The value of primary key must not be null.

**Entity Integrity Constraint** : 

- Entity integrity constraint specifies that no attribute of primary key must contain a null value in any relation.
- This is because the presence of null value in the primary key violates the uniqueness property.

**Referential Integrity Constraint** : 

- This constraint is enforced when a foreign key references the primary key of a relation.
- It specifies that all the values taken by the foreign key must either be available in the relation of the primary key or be null.



- The following two important results emerges out due to referential integrity constraint-
  - We can not insert a record into a referencing relation if the corresponding record does not exist in the referenced relation.
  - We can not delete or update a record of the referenced relation if the corresponding record exists in the referencing relation.



## Keys

* A key in DBMS is an attribute or a set of attributes that help to uniquely identify a tuple (or row) in a relation (or table). 
* Keys are also used to establish relationships between the different tables and columns of a relational database. 
* Individual values in a key are called key values.



There are broadly seven types of keys in DBMS:

1. Primary Key
   * A primary key is a column of a table or a set of columns that helps to identify every record present in that table uniquely. 
   * There can be only one primary Key in a table. 
   * Also, the primary Key cannot have the same values repeating for any row.
   *  Every value of the primary key has to be different with no repetitions.
2. Candidate Key
   * Candidate keys are those attributes that uniquely identify rows of a table.
   * The Primary Key of a table is selected from one of the candidate keys.
   * There can be more than one candidate keys in a table.
3. Super Key
   * Super Key is the set of all the keys which help to identify rows in a table uniquely.
   * Super Key is the superset of a candidate key. 
   * The Primary Key of a table is picked from the super key set to be made the table’s identity attribute.
4. Foreign Key
   * Foreign Key is used to establish relationships between two tables. 
   * A foreign key will require each value in a column or set of columns to match the Primary Key of the referential table. 
   * Foreign keys help to maintain data and referential integrity. 
5. Composite Key
   * Composite Key is a set of two or more attributes that help identify each tuple in a table uniquely. 
   * The attributes in the set may not be unique when considered separately. However, when taken all together, they will ensure uniqueness.
6. Alternate Key
   * A table can have multiple choices for a primary key; however, it can choose only one. So, all the keys which did not become the primary Key are called alternate keys.
7. Unique Key
   * Unique Key is a column or set of columns that uniquely identify each record in a table. All values will have to be unique in this Key. A unique Key differs from a primary key because it can have only one null value, whereas a primary Key cannot have any null values.

