package com.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyTypeRepository extends JpaRepository<BranchRepository,Integer> {
}
