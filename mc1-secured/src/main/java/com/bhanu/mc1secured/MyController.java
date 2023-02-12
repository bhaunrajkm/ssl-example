package com.bhanu.mc1secured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class MyController {

  @GetMapping
  public String get() {
    return "Secured information";
  }
}
