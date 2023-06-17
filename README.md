# Developing Applications Using JSF and PrimeFaces by Proton Expert Systems & Solutions
![](https://img.shields.io/badge/status-completed-brightgreen)

<p align="center">
<img src=".github/logo.png">
</p>

JSF, PrimeFaces, JQuery, JSF with Ajax, JSF with JQuery from [Udemy](https://www.udemy.com/course/developing-applications-using-jsf-and-primefaces/).

Creator: Proton Expert Systems & Solutions

## History of commands

```bash
# Install openJDK 17 globally
sudo apt install openjdk-17-jdk

# Add JAVA_HOME
echo 'export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64/"' | \
sudo tee /etc/profile.d/jdk.sh

# Download Netbeans package from:
# https://netbeans.apache.org

# Install Netbeans globally
sudo apt install ./apache-netbeans_17-1_all.deb

# Download Tomcat 9 from
# https://tomcat.apache.org/download-90.cgi
# Extract package
tar -zxf apache-tomcat-9.0.73.tar.gz -C ~/.apps

# Install MySQL Server and open shell
sudo mysql -u root -p
```

### MySQL Shell commands used in \#05

```sql
create database students;

use students;

CREATE TABLE student_record (
student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
student_name VARCHAR(100), 
student_email VARCHAR(50), 
student_password VARCHAR(20), 
student_gender VARCHAR(1), 
student_address VARCHAR(100));

show tables;
```

### MySQL Shell commands used in \#06

```sql
create database students;

use students;

CREATE TABLE categories (
	id INT(11) NOT NULL AUTO_INCREMENT,
	category_name VARCHAR(50) NOT NULL DEFAULT '0',
	PRIMARY KEY (id)
);

insert into categories(category_name) values('CSE');
insert into categories(category_name) values('IT');
insert into categories(category_name) values('Mechanical');
insert into categories(category_name) values('EEE');
insert into categories(category_name) values('EC');
insert into categories(category_name) values('Civil');

show tables;
```