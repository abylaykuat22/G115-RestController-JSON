package kz.bitlab.G115rest.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/")
  public String homePage() {
    List<String> names = List.of("China", "Misha", "Danik", "Aldik");
    System.out.println(names);
    return "home";
  }
}
