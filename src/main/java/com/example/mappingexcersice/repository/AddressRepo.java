package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.onetoone.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
