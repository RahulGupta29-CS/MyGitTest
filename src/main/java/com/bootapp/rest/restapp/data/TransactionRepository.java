package com.bootapp.rest.restapp.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootapp.rest.restapp.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


}