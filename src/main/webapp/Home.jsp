

<%@page import="com.project.connector.DatabaseConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
             clip-path: polygon(100% 0%, 75% 50%, 100% 100%, 0 100%, 0% 50%, 0 0);
            }
        </style>

    </head>
    <body>

        
        <%@include file="Hamro_nav.jsp" %>

        <!--//banner-->

        <div class="container-fluid p-0 m-0">

            <div class="jumbotron primary-background text-white banner-background">
                <div class="container">
                    <h3 class="display-3">Bijay's Tech Blog </h3>
					<br>
                    <p>Welcome to Bijay's Corner!<br>
					Hello and welcome! I'm Bijay, the voice behind this blog. Whether you're a first-time visitor or a returning reader, I'm thrilled to have you here.
                    </p>
                    <p>I believe in the power of community and conversation. Your thoughts, feedback, and experiences are invaluable to me. Feel free to comment on posts, share your insights, and connect with me on social media.

Thank you for visiting Bijay's Corner. I hope you find inspiration, knowledge, and a sense of camaraderie here. Happy reading!</p>

                   <a href="Register.jsp"><button class="btn btn-outline-light btn-lg"> <span class="	fa fa-handshake-o"></span> Let's connect!</button></a>
                    <a href="Login.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-user-circle fa-spin"></span>  Login</a>

                </div>
            </div>






        </div>



        <!--//cards-->

        <div class="container">

            <div class="row mb-2">

                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java Programming Basics</h5>
                            <p class="card-text">Java is a versatile, object-oriented programming language widely used for building robust and high-performance applications. Its "write once, run anywhere" capability makes it a favorite among developers. </p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">JDBC: Java Database Connectivity</h5>
                            <p class="card-text">JDBC (Java Database Connectivity) is an API that enables Java applications to interact with databases. Here's a quick overview:

Introduction to JDBC: JDBC allows you to execute SQL statements, retrieve results, and update records in a database.
Setting Up JDBC: To use JDBC, include the JDBC driver for your database in your project's classpath.
Basic Operations: Learn how to establish a connection, create a statement, execute queries, and handle results.</p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Hibernate: Simplifying Database Interactions</h5>
                            <p class="card-text">Hibernate is an Object-Relational Mapping (ORM) framework that simplifies database interactions in Java applications.

Introduction to Hibernate: Hibernate maps Java classes to database tables, automating the process of converting data between incompatible type systems.
Setting Up Hibernate: Configure Hibernate with an XML or annotation-based configuration file.
Basic CRUD Operations: Learn how to perform Create, Read, Update, and Delete (CRUD) operations using Hibernate.</p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>


            </div>




            <div class="row">

                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Servlets: Building Dynamic Web Applications</h5>
                            <p class="card-text">Servlets are Java programs that run on a server, handling requests and responses in web applications.

Introduction to Servlets: Servlets process client requests, typically from a web browser, and generate dynamic responses.
Setting Up Servlets: Use a servlet container like Apache Tomcat to deploy and run servlets.</p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Spring Boot: Simplifying Java Developmentg</h5>
                            <p class="card-text">Spring Boot is an extension of the Spring framework that simplifies the setup and development of new Spring applications.

								Introduction to Spring Boot.
                            </p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">JSP: JavaServer Pages</h5>
                            <p class="card-text">JSP (JavaServer Pages) is a technology used to create dynamic web pages using HTML, XML, or other document types.

Introduction to JSP: JSP allows embedding Java code directly into HTML pages.
Setting Up JSP: Deploy JSP files in a servlet container like Tomcat.
                            </p>
                            <a href="#" class="btn primary-background text-white">Read more</a>
                        </div>
                    </div>
                </div>


            </div>

        </div>



        <!--javascripts-->
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>

    </body>
</html>