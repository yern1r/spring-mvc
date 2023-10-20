package com.yernaryelemess.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping ("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(350);
//        model.addAttribute("employee", emp);


        model.addAttribute("employee", new Employee());


        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp){

        String name = emp.getName();
        emp.setName("Mr " + name);

        String surname = emp.getSurname();
        emp.setSurname(surname + "ov");

        int salary = emp.getSalary();
        emp.setSalary(salary*2);


        return  "show-emp-details-view";
    }










//**********************************************//


//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName,
//                                      Model model){
//
//        empName = " Mr. " + empName + " !";
//        model.addAttribute("nameAttribute", empName);
//
//        return  "show-emp-details-view";
//    }


    //**********************************************//

    //    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return  "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//
//        String emp_Name = request.getParameter("employeeName");
//        emp_Name = " Mr. " + emp_Name;
//
//        model.addAttribute("nameAttribute", emp_Name);
//
//
//        return  "show-emp-details-view";
//    }
}
