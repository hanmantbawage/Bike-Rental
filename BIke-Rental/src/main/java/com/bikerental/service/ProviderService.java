package com.bikerental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bikerental.model.Provider;

public interface ProviderService {
	
	public void addProvider(Provider provider);
	public void removeProvider(long id);
	public Provider getProvider(long id);
	public void modifyProvider(Provider provider);
	public List<Provider> getAll();
		
}
