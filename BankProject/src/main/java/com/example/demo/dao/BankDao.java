package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Bank;

public interface BankDao extends CrudRepository<Bank, String>
{
	
}
