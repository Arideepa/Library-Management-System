package com.xfactor.openlibrary.controllers;

import java.util.*;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xfactor.openlibrary.domain.Loan;
import com.xfactor.openlibrary.repositories.LoanRepository;

@RestController
@RequestMapping("loans")
public class LoansController {
    private LoanRepository loanRepository;

    public LoansController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @PostMapping("/saveLoan")
    public Loan saveLoan(@RequestBody Loan loan) {
        if (loan.getId() == 0L) {
         Loan loan2 = loanRepository.save(loan);
            return loan2;
        }
       return null;

    }

    @PutMapping("/updateLoan")
    public Loan updateLoan(@RequestBody Loan loan) {
        if (loan.getId() != 0L) {
            Loan loan2 = loanRepository.save(loan);
            return loan2;
        }
        return null;

    }   

    @GetMapping("/getAll")
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @GetMapping("findById/{id}")
    public Loan findById(@PathVariable Long id) {
        Optional<Loan> optionalOfLoan = loanRepository.findById(id);
        if (optionalOfLoan.isPresent()) {
            return optionalOfLoan.get();
        }
        return null;
    }

    @GetMapping("findTotal")
    public Long findTotal() {
        return loanRepository.count();
    }

    @DeleteMapping("delete/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanRepository.deleteById(id);
    }

   /* @GetMapping("findByStudentId/{studentId}")
    public List<Loan> findByStudentId(@PathVariable String studentId) {
        List<Loan> loans = loanRepository.findByStudentId(studentId);
        return loans;
    }*/

}

    

