# Microblog

To get started, [fork this repository](https://github.com/NOVA-Uncommon-Coders/SpringBasics).

Let's build a "Microblog". But first, enjoy this gif of Star Wars Kid.

![screenshot](http://stream1.gifsoup.com/view/162193/star-wars-kid-o.gif)

## Description

Make a web application that allows you write short messages. When you click "Submit", it will refresh and show a list of messages you wrote.

## Requirements

* Add the Spark and Mustache libraries in Project Structure.
  * `com.sparkjava:spark-core:2.3`
  * `com.sparkjava:spark-template-mustache:2.3`
* Create a `resources` folder in Project Structure and mark it with the "Resources" designation.
* Create a `templates` folder inside of it.
* Create `resources/templates/index.html` which looks like in the first screenshot below.
* Create a GET route for "/" and a POST route for "/create-user" and "/create-message".
* When the user hits submit in "index.html", it should post the name to "/create-user" which saves it in a user object and redirects to "/".
* Create `resources/templates/messages.html` which looks like the second screenshot below. It must display the name given by the user, and use Mustache templating to list the messages written by the user.
* When the user hits submit in "messages.html", it should post the text to "/create-message" which saves it in an `ArrayList<Message>` and redirects to "/" (i.e. refreshes the page).

## HARDMODE
* Add styling with CSS.
* Use semantic HTML elements.
* Limit each message to 140 characters.
* Stop people from creating empty users.

![screenshot 1](https://github.com/oakes/java-assignments/raw/master/4.1-microblog/screenshot1.png)
![screenshot 2](https://github.com/oakes/java-assignments/raw/master/4.1-microblog/screenshot2.png)