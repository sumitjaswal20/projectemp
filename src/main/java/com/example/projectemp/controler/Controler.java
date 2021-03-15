package com.example.projectemp.controler;

import com.example.projectemp.Service.ServiceEmpIn;
import com.example.projectemp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controler {
    @Autowired
    ServiceEmpIn serviceEmpIn;
    @GetMapping("/")
public String showemp(Model model)
{
    model.addAttribute("listemp",serviceEmpIn.showemp());
    return "index";
}
@GetMapping("/showNewEmployee")
public String showNewEmployee(Model model)
{
Employee employee=new Employee();
model.addAttribute("employee",employee);
return "addnewemp";
}
@PostMapping("/saveemp")
      public String addemp(@ModelAttribute ("employee") Employee employee)
    {
        serviceEmpIn.addemp(employee);
        return "redirect:/";

    }
}
