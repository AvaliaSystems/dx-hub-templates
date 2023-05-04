package io.avalia.${{ values.name | replace("-", "") }}.api;

import io.avalia.${{ values.name | replace("-", "") }}.api.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Date;

@RestController
public class GreetingController {

  private String randomMessage() {
    String[] choices = new String[]{"Hello", "Good morning", "Hi there", "Yo", "Hey"};
    int index = (int) (Math.random() * choices.length - 1);
    return choices[index];
  }

  private String randomColor() {
    int R = (int) Math.round(Math.random() * 255);
    int G = (int) Math.round(Math.random() * 255);
    int B = (int) Math.round(Math.random() * 255);
    return "#" + String.format("%02X", R) + String.format("%02X", G) + String.format("%02X", B);
  }

  @GetMapping("/greeting")
  public Greeting getGreeting() {
    Greeting greeting = Greeting.builder()
      .timestamp(new Date())
      .message(randomMessage())
      .color(randomColor())
      .build();
    return greeting;
  }
}
