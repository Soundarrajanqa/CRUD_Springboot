Created a mock server to test below crud operations. basically wanted to understand the functionality behind the scene of rest api development.

Created a simple employee service using spring boot

deps: 

lombok - to avoid boiler plate code
spering web - to package & run it using tomcat server
spring data jps - to interact with db
h2 database - in men=mory db


Get:

All employees:
End point: http://localhost:8080/employees
request body: null

specific employees: (path parameters)
End point: http://localhost:8080/employees/3
request body: null

specific employees: (query parameters)
End point: http://localhost:8080/employeesueryparams
params => limit : 3
request body: null

POST:

End Point: http://localhost:8080/employees
request body: {
    "id": 3,
    "name": "DNJDJer",
    "email": "random@mail.com"
}

DELETE:

EndPoint: http://localhost:8080/employees/3
requestbody: null

PUT:

EndPoint: http://localhost:8080/employees/4
requestBody: {
        "id": 4,
        "name": "dskjfgmnkjdfkjdfjkmgkldfmdfg",
        "email": "email@com.commerce@.com"
    }


