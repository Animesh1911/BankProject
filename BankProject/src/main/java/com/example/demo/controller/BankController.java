package com.example.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BankDao;
import com.example.demo.model.Bank;

@Controller
public class BankController 
{
	@Autowired
	BankDao repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/Open")
	public ModelAndView openAccount(Bank bank)
	{
		Random rnt = new Random();
		long number = rnt.nextLong(9999999999L);
		String account_number = String.format("%10d", number);
		bank.setAccNum(account_number);
		//System.out.println(bank.getBal());
		//System.out.println(bank.getcName());
		//System.out.println(bank.getAccNum());
		String output = "Hello " + bank.getcName() + ", welcome to BANK PRO MAX. Your Account Number is " + account_number;
		repo.save(bank);
		ModelAndView mv = new ModelAndView("Open.jsp");
		mv.addObject("Output",output);
		return mv;
	}
	
	@RequestMapping("/Check")
	public ModelAndView checkBalance(@RequestParam String aNum) 
	{
		//System.out.println(aNum);
		ModelAndView mv = new ModelAndView("Check.jsp");
		Bank bank = repo.findById(aNum).orElse(new Bank());
		//System.out.println(bank.getBal());
		//System.out.println(bank.getcName());
		//System.out.println(bank.getAccNum());
		String output;
		if (bank.getBal() == 0)
			output = "The account number does not exist. Please enter a valid account number.";
		else
			output = "Hello " + bank.getcName() + ", your current balance is Rs. " + bank.getBal();
		mv.addObject("Output",output);
		return mv;
	}
	
	@RequestMapping("/Withdraw")
	public ModelAndView Withdraw(@RequestParam String aNum, int Bal) 
	{
		//System.out.println(aNum + Bal);
		Bank bank = repo.findById(aNum).orElse(new Bank());
		//System.out.println(bank.getBal());
		int balance = bank.getBal() - Bal;
		//System.out.println(balance);
		//System.out.println(bank.getcName());
		//System.out.println(bank.getAccNum());
		ModelAndView mv = new ModelAndView("Withdraw.jsp");
		bank.setBal(balance);
		//repo.save(bank);
		String output;
		if (bank.getcName() == null)
			output = "The account number does not exist. Please enter a valid account number.";
		else {
			output = "Hello " + bank.getcName() + ", your balance after withdrawal is Rs. " + bank.getBal();
			repo.save(bank);
		}
		mv.addObject("Output",output);
		return mv;
	}
	
	@RequestMapping("/Deposit")
	public ModelAndView Deposit(@RequestParam String aNum, int Bal) 
	{
		//System.out.println(aNum + Bal);
		Bank bank = repo.findById(aNum).orElse(new Bank());
		//System.out.println(bank.getBal());
		int balance = bank.getBal() + Bal;
		//System.out.println(balance);
		//System.out.println(bank.getcName());
		//System.out.println(bank.getAccNum());
		ModelAndView mv = new ModelAndView("Withdraw.jsp");
		bank.setBal(balance);
		//repo.save(bank);
		String output;
		if (bank.getcName() == null)
			output = "The account number does not exist. Please enter a valid account number.";
		else {
			output = "Hello " + bank.getcName() + ", your balance after deposit is Rs. " + bank.getBal();
			repo.save(bank);
		}
		mv.addObject("Output",output);
		return mv;
	}
}
