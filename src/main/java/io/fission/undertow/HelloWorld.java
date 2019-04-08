package io.fission.undertow;

import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class HelloWorld implements Function
{

    @Override public void call(HttpServerExchange exchange)
    {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.setStatusCode(200);
        exchange.getResponseSender().send("Hello World...");
    }

}
