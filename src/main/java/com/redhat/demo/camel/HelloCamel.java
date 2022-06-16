package com.redhat.demo.camel;

// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class HelloCamel extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Write your routes here, for example:
        from("timer:java?period={{time:10000}}").routeId("java")
            .setBody()
                .simple("Hello Camel from ${routeId}")
            .log("${body}");
    }
}
