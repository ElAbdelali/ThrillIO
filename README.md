# ThrillIO
This is an Application built from the things I learn from the course 
		Java In-Depth: Become A Complete Java Engineer
		
Implementation Details include:

	1. Features learned from the course
	2. Object-Oriented Design and Coding Conventions
	3. Project/Application was built utilizing the Eclipse IDE
	4. Design Patterns: MVC & Singleton
	5. Development process: Test Driven Development
	
	
	
Project Specification: 

	Process:
		Model and Controller 
		View - Java Class 
		Database - DataStore (Java Class)
		
		Entities include:
			1. User
			2. Bookmark
			3. Movie
			4. Book
			5. WebLink
			6. UserBookmark


	1. Load Data
		a. 5 users
		b. 15 bookmarks
	2. Bookmarking
		a. User bookmarks 5 items
		b. Duplicates are allowed
	3. Mark Kid-Friendly Bookmarks
		a. By (Chief) Editor
		b. Kid-friendly eligibility criteria
	4. Share Kid-Friendly Bookmarks
		a. By (Cheif) Editor of Staff
		b. Only books and WebLinks

MVC Architecture will be used in the project.
Why? It's very popular for Web Applications.
Layers are Loosely Coupled and interact well with one another.

Benefit of using MVC: Separation of business logic from presentation layer 

Model - Contains two subLayers: 

	1. Service Layer contains the business logic for the application
		a. Classes found in the Service Layers are known as Managers or Services
	2. Daos which communicates with databases and contains SQL queries.
		a. DAOS stands for: Data Access Objects
		b. Classes found in the Daos layer are reffered to as Daos
Controller - Servlets
View - JSPs (Presentation)