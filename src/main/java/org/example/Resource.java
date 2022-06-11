package org.example;

import io.javalin.apibuilder.EndpointGroup;
import io.javalin.http.Context;
import org.example.model.User;

import java.util.UUID;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;
import static java.util.UUID.randomUUID;

public class Resource {

    public EndpointGroup routes() {
        return () -> path("/users", () -> {
            path("/current", () -> {
                post(this::updateCurrent);
                get(this::getCurrent);
            });
            path("/{id}", () -> get(this::getUser));
            get(this::getAll);
        });
    }

    private void updateCurrent(Context context) {
        final var user = new User(randomUUID(), "some name", "sone nickname", "some bio");
        context.json(user);
    }

    private void getCurrent(Context context) {
        final var user = new User(randomUUID(), "some name", "sone nickname", "some bio");
        context.json(user);
    }

    private void getUser(Context context) {
        final var user = new User(randomUUID(), "some name", "sone nickname", "some bio");
        context.json(user);
    }

    private void getAll(Context context) {
        final var user = new User(randomUUID(), "some name", "sone nickname", "some bio");
        context.json(user);
    }

}
