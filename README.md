# TodoApp
To-do app built with Spring boot and Vue, pair programmed with Jeremy Pavlich

## API Routes

```
/api/get-todos
```
### Method: Get
Returns an array of all todo objects

```
/api/get-todos/${status}
```
### Method: Get
Returns an array of all todos where status is the same as the status variable paramater. 

```
/api/create-todo
```
### Method: Post

ALlows you to create a new todo. The status is always "not started". Only title and description need to be set. A request body would look like

```
{
"title": "Read a bood",
"desc": "Finish reading Harry Potter and the Chamber of Secrets"
}
```

```
/api/update/${id}
```
### Method: Patch

Updates the to-do with the matching id. No required fields, but can take a maximum of three: ```title```, ```desc```, and ```status```

```
/api/delete/${id}
```

### Method: Delete

Deletes the to-do with the matching id. No body needed
