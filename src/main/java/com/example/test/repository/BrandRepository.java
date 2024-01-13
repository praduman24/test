package com.example.test.repository;

import com.example.test.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {

      Optional<Brand> findByName(String name);

      @Modifying
      @Query("delete from Brand b where b.name = :brandName")
      void deleteBrandByName(String brandName);

      @Modifying(clearAutomatically = true, flushAutomatically = true)
      @Query(value = "update brand b set b.logo = :logo where b.name = :brandName", nativeQuery = true)
      void modifyLogoByBrandName(String brandName,String logo);
}
