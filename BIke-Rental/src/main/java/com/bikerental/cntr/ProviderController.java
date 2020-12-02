package com.bikerental.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping(value = "prov_del/{id}")
	public String provDelete(@PathVariable long id) {
		providerService.removeProvider(id);
		return "success";
	}
	
	@GetMapping(value = "get_prov/{id}")
	public Provider getProv(@PathVariable long id) {
		return providerService.getProvider(id);
	
	}
	
	@PutMapping(value = "prov_update")
	public String carUpdate(@RequestBody Provider provider) {
		providerService.modifyProvider(provider);	
		return "success";
	}
}
