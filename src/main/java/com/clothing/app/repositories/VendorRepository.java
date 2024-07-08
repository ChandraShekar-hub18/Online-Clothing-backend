package com.clothing.app.repositories;

import com.clothing.app.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
