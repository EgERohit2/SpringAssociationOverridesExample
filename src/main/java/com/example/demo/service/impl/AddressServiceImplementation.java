package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;
@Service
public class AddressServiceImplementation implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
}
