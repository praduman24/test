package com.example.test.service.brand;

import com.example.test.entity.Brand;
import com.example.test.repository.BrandRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public void saveBrand(Brand brand) {

        if(brand.getName() == null){
            throw new RuntimeException("Error namne is null exceptionnnnnn");
        }

        brandRepository.save(brand);
    }

    @Transactional
    @Override
    public void updateBrandLogo(Brand brand) {
        Optional<Brand> dbBrand = brandRepository.findByName(brand.getName());

        if(dbBrand.isPresent()){
            brandRepository.modifyLogoByBrandName(brand.getName(), brand.getLogo());

            Optional<Brand> dbBrand2 = brandRepository.findByName(brand.getName());

            System.out.println(dbBrand2.toString());
        }

    }

    @Override
    public void deleteBrand(String brandName) {
        Optional<Brand> dbBrand = brandRepository.findByName(brandName);

        if(dbBrand.isPresent()){
            brandRepository.deleteBrandByName(brandName);

            Optional<Brand> dbBrand2 = brandRepository.findByName(brandName);

            System.out.println(dbBrand2.toString());
        }
    }


}
