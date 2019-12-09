package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_TRANS")
public class Transaction {
		@Id
		@GeneratedValue
		int transId;
		
		String transType;
		double amount;
		
		@ManyToOne
		@JoinColumn(name="accno")
		Account account;

		public int getTransId() {
			return transId;
		}

		public void setTransId(int transId) {
			this.transId = transId;
		}

		public String getTransType() {
			return transType;
		}

		public void setTransType(String transType) {
			this.transType = transType;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}
		
		
}
