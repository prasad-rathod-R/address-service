package com.ms.app.addressservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.app.addressservice.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}