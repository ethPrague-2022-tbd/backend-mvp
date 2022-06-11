package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import io.javalin.plugin.json.JavalinJackson;

public class Main {

    public final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        final var server = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.jsonMapper(new JavalinJackson(OBJECT_MAPPER));
        });
        server.routes(new Resource().routes());
        server.start(4567);

    }
}