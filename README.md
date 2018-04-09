# locals-data
## Synopsis

User REST API Service

This microservice contains logic for users and posts


## Data Model

```
{
  "code": <int_code>,
  "message": <message_string>
}

```

|Field              |Type           |Description                                                                  |
|-------------------|---------------|-----------------------------------------------------------------------------|
|id     			|String         |The primary identifier of a User (randomly generated)   					                      |
|username           |String         |The username of a user                                                       |
|karma              |Integer        |The number of (upvotes - downvotes) corresponding to a user's posts            |
|posts              |List<String>   |The posts a user has created                                                 |



### Sample JSON User

```
{
  "id": 2,
  "username": "my_username",
  "karma": 1012,
  "posts": ["141", "232", "525", "410"]
}
```

## Code Examples

### POST /user

This method is utilized to save a user

URL:

##### Sample Request Body:
```
{
  "username": "new_user"
}
```
TO-DO: Add flow diagram -- ![POST /user](misc/POST_user.png "POST /user diagram")

(TO-DO: Implement error handling)
- Returns a 201 CREATED if the user is successfully created
- Returns a 400 BAD REQUEST if the user already exists (err code: 1800)
- Returns a 400 BAD REQUEST if the user JSON input is invalid (err code: 1802)

### GET /user

This method is utilized to retrieve users with filters

URL: (run locally)

Query params currently supported are:
- String: username
- Integer: karma


TO-DO: Add flow diagram --![GET /user](misc/GET_user.png "GET /user diagram")

- Returns a 200 OK with 0 to many users matching the criteria (TO-DO: Return response object?)


### GET /user/{username}

This method is utilized to retrieve a particular user using its username

URL:

TO-DO: Add flow diagram --![GET /user/{user-id}](misc/GET_user_by_id.png "GET /user/{user-id} diagram")

- Returns a 200 OK with either an empty object (if user does not exist) or the user itself (TO-DO: Return response object?)


### PUT /user (TO-DO: Implement PUT endpoint)

This method is utilized to update a user's username, karma, and/or posts

##### Sample Request Body:
```
{
  "username": "user1",
  "karma": -999,
  "posts": []
}
```

URL:

TO-DO: Add flow diagram -- ![PUT /user](misc/PUT_user.png "PUT /user diagram")

- Returns a 200 OK with the updated user (TO-DO: Return response object?)
- Returns a 400 BAD REQUEST if the user(s) does not exist (err code: 1802) (TO-DO: Implement)

### DELETE /user/{user-id} (TO-DO: Implement)

This method is utilized to delete specific user(s) using its ID (userId)


URL:

![DELETE /user/{user-id}](misc/DELETE_user.png "DELETE /user/{user-id} diagram")

- Returns a 200 OK to confirm deletion of user
- Returns a 400 BAD REQUEST if the user(s) does not exist (err code: 1802)

### General Errors
- Returns a 500 INTERNAL SERVER ERROR if an unexpected error has occurred (err code: 1897)
- Returns a 400 BAD REQUEST for malformed (unparseable) JSON requests (err code: 1899)


## How to Run

* Make sure you are using JDK 1.8 and Maven 3.x
* Clone this repository (create SSH key first and link account)

````bash
$ git clone git@github.com:jrh9/locals-data.git
````

Ensure system setup is correct
````bash
$ mvn clean package
````

Compile the program
````bash
$ mvn clean install
````

On successful build, run the service locally
````bash
$ java -jar ./target/<compiled_project_name>.jar
````

### Ensure data can be retrieved by hitting endpoint (via Postman)
- Change HTTP method to GET
- Enter URL: http://localhost:8080/users for user data
- Enter URL: http://localhost:8080/posts for post data


