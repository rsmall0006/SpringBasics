package com.theironyard.novauc;

import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
//    static HashMap<String, User> users = new HashMap<>();
//    static ArrayList<Message> messages = new ArrayList<>();
    public static ArrayList themessages = new ArrayList();
    static User user;
//    static Message message;
    public static void main(String[] args) {
//        addTestUsers();
//        addTestMessages();

        Spark.init();

        Spark.get("/",
                ((request, response) -> {
                    HashMap log = new HashMap();

                    if (user == null) {
                        return new ModelAndView(log, "index.html");
                    } else {
                        log.put("name", user.name);
                        log.put("message", themessages);
                        return new ModelAndView(log, "messages.html");
                    }
                }
                ), new MustacheTemplateEngine()
        );

        Spark.post("/user",
                ((request, response) -> {
                    String name = request.queryParams("user");
                    user = new User(name);
                    response.redirect("/");
                    return "";
                }));
        
        Spark.post("/message",
                ((request, response) -> {
                    String message = request.queryParams("message");
                    Message mm = new Message(message);
                    themessages.add(mm);
                    response.redirect("/");
                    return "";
                })
        );
    }
}
