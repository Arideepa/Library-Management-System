package com.xfactor.openlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Loan;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByStudentId(String studentId);
    
} 
