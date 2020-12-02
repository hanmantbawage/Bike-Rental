package com.bikerental.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikerental.model.Provider;
import com.bikerental.service.ProviderService;

@RestController
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;
	
	@PostMapping(value = "prov_add")
	public String addProv(@RequestBody Provider provider) {
		providerService.addProvider(provider);
		return "success";
	}

	@GetMapping(value = "prov_list")
	public List<Provider> provList(){
		return providerService.getAll();
	}
}
