package com.javainuse.controllers;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Customer;


@RestController

public class TestController {

 @RequestMapping(value = "/customer", method = RequestMethod.GET)

 public Customer firstPage() {

 Customer cust = new Customer();

 cust.setCust_Name("Uttam");

 cust.setCust_Address("Indore");

 cust.setCust_Id("1");

 cust.setCust_Pin(465333);

 return cust;

 }

}











