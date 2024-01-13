package com.example.test.service.city;

import com.example.test.entity.Brand;
import com.example.test.entity.City;
import com.example.test.repository.CityRepository;
import com.example.test.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private BrandService brandService;

    @Override
    public void saveCity(City city, Brand brand) {
        cityRepository.save(city);
        brandService.saveBrand(brand);
    }
}
