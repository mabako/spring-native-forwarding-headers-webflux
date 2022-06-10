package com.example.demo;

import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class PrintUriController {

  @GetMapping(value = "/print-uri", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<String> printUri(ServerWebExchange exchange) {
    return Mono.just(exchange.getRequest().getURI()).map(URI::toString);
  }
}
