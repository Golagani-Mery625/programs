package com.spring.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstController
{
  @GetMapping("/disp")
  public String getDisplay()
  {
	  return "Display";
  }
  
}
