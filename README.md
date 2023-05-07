# Employee Address Management 

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `MySql Version 8.0.32`
* `Spring Boot 3.0.5(Framwork)`
*  `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:

### 1. Models:
* It consists Employee and Address entity classes along with their properties.
* Used @Entity annotation to crate table of class in database.
* Create constructors and getters and setters of both of classes By using annotation @Data and @AllArgsConstructor and @NoArgsConstructor.
* Used @OneToOne annotation to perform one to one mapping between Employee and Address.

### 2. Controllers:
* It consists of EmployeeController and AddressController classes in which used the annotations like @RestController to annotate the class as Controller layer.
* Used annotation @GetMapping , @PostMapping , @PutMapping , @DeleteMapping to map the HTTP web requests to the specific handler methods.


### API References:

#### Employee API References

* Add Employee:
```
  http://localhost:8080/employee
```

* Get all Employees:
```
http://localhost:8080/employee/all
```

* Get Employee By employeeId:
```
 http://localhost:8080/employee/id/{employeeId}
```

* Update Employee by employeeId:
```
  http://localhost:8080/employee/id/{employeeId}/firstName/{firstName}/lastName/{lastName}
```

* Delete Employee by employeeId:
```
http://localhost:8080/employee/id/{employeeId}

```

#### Addresse API References:

* Add Address:
```
  http://localhost:8080/address
```

* Get all Addresses:
```
 http://localhost:8080/address/all
```

* Get Address By AddressId:
```
  http://localhost:8080/address/id/{addressId}
```

* Update Address Street by AddressId:
```
  http://localhost:8080/address/id/{addressId}/street/{street}
```

* Delete Address by AddressId:
```
  http://localhost:8080/address/id/{addressId}
```

### 3. Services:
* It consists  EmployeeService and AddressService classes in which having some business logic of every handler methods.
* Used *@Service* annotation to indicate that a class belongs to the service layer.

### 4. Repositories:
* It consists of IEmployeeRepo and IAddressRepo interfaces that extends CrudRepository interface so we can use inbuilt crudRepo method and we create some cusom finder method and writting some query method to perform crud operation like create ,read, update and delete.
* Used @Repository annotation to indicate that a interface belongs to the repository layer(Dao layer).


## Project Summary:

In this spring boot application I had created API's mapping for CRUD operations like create(save), read(find), update and delete .Aim of this project to perform one to one mapping between Employee and Address.In this project  Using the CrudRepositorya Interface method and createing and using custom finder method and custom query method.