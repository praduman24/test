package com.example.test.service.brand;

import com.example.test.entity.Brand;

public interface BrandService {

    void saveBrand(Brand brand);

    void updateBrandLogo(Brand brand);

    void deleteBrand(String brandName);
}
