package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Transactions;

public class TransactionServiceImpl implements TransactionService{

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
        // TODO Auto-generated method stub
        
    }
    
}