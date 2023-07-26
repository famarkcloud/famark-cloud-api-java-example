# famark-cloud-api-java-example
This is a sample code showing how to call Famark Cloud API to store and retrieve data through Java programming language.

### Setup Steps:
1. This example requires **Famark Cloud Instance**, you can [register free instance](https://www.famark.com/Install/?ic=FreeDev) or sign in to your [existing instance](https://www.famark.com/) or *Download Famark Cloud* for *Windows* and *Linux* platforms from [famark cloud products](https://www.famark.com/cloud/products.htm).
2. This example performs *Create, Retrieve, Update and Delete (CRUD)* actions on *Contact* entity present in *Business Solution*, so make sure you have the Business solution installed in your instance, if not installed then goto:-  
*`Solutions > more actions (...) > Import Solution > Import From Store > Business Solution Install > Import Solution`*
3. Clone this repository and use the following commands to compile and run the java code.

### Command to Compile:

`javac -cp ".\lib\json-simple\json-simple-1.1.1.jar;.\src" .\src\App.java`

### Command to Run:

`java -cp ".\lib\json-simple\json-simple-1.1.1.jar;.\src" App`

*You can modify the code to perform CRUD operations on your own entities.*
