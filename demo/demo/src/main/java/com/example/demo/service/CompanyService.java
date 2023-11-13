package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(Long companyId){
        companyRepository.deleteById(companyId);
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
}
