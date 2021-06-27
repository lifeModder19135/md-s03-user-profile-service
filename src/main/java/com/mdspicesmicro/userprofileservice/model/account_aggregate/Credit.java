package com.mdspicesmicro.userprofileservice.model.account_aggregate;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;


@Data
@Table("CREDIT")
public class Credit {

	@Builder
    public Credit(Long id) {
    	this.accountId = id;
    	this.amount = 0.00;
    	this.status = CreditStatus.PENDING;
    }
    
    @Id
	@Column(value="account_id")
    private Long accountId;
    
    @Column(value="amount")
    private double amount;
    
    @Column(value="account_")
    private CreditStatus status;


}