[SmallSocialNetwork_README.md](https://github.com/user-attachments/files/26673304/SmallSocialNetwork_README.md)
# SmallSocialNetwork 

A **Facebook-inspired social network** built in Java. Developed as an Object-Oriented Programming university project at FCT NOVA Lisbon.

##  About

SmallSocialNetwork manages a set of registered users and their symmetric friendship relationships through a command-line interface. The system supports up to 500 users, each with up to 50 friends.

##  Features

- **User registration** — register users with name, email and status message
- **Friendship management** — add and check symmetric friendship relationships
- **Status updates** — users can update and check their current status
- **User listing** — list all registered users ordered by insertion
- **Full validation** — duplicate detection, non-existent user handling, self-friendship prevention

##  Commands

```
REGISTERED      - checks if a user is registered
REGISTER        - registers a new user (name, email, status)
CHECKFRIENDSHIP - checks if a friendship exists between two users
ADDFRIEND       - creates a friendship between two users
FRIENDS         - lists all friends of a user
NEWSTATUS       - updates a user's status message
CHECKSTATUS     - displays a user's current status
USERS           - lists all registered users
QUIT            - terminates the program
```

##  Usage example

```
REGISTER
Ana
ana@gmail.com
Hello world!
Successfully registered.

REGISTER
Bruno
bruno@gmail.com
Working...
Successfully registered.

ADDFRIEND
Ana
Bruno
Friendship created.

FRIENDS
Bruno
Friends list:
Ana; ana@gmail.com

CHECKFRIENDSHIP
Ana
Bruno
Existing friendship.
```

##  OOP Concepts Applied

- Interface-driven design for the social network model
- Encapsulation of user and friendship data
- Ordered collections preserving insertion order
- Input validation and error handling

##  Tech

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

**Course:** Object-Oriented Programming — FCT NOVA Lisbon
