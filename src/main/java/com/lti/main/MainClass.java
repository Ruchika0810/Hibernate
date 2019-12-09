package com.lti.main;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.dao.AccountDao;
import com.lti.dao.AddressDao;
import com.lti.dao.PersonDao;
import com.lti.entity.Account;
import com.lti.entity.Address;
import com.lti.entity.Passport;
import com.lti.entity.Transaction;
import com.lti.entity.User;




public class MainClass {
	public static void main(String[] args) {

		// Customer c = new Customer();
		/*
		 * c.setName("Ruchika"); c.setCity("Mumbai"); c.setEmail("ruchika@lti");
		 */

		// CustomerDao dao= new CustomerDao();
		// dao.add(c);
//		CustomerDao dao = new CustomerDao();
//		Customer c = dao.display(21);
//		System.out.println(c.getName());
//		System.out.println(c.getCity());
//		System.out.println(c.getEmail());

//			CustomerDao dao = new CustomerDao();
//			List<Customer> list = dao.fetchAll();
//			for(Customer c : list) {
//				System.out.println(c.getCity());
//				System.out.println(c.getName());
//				System.out.println(c.getEmail());
//			}	
		
//		CustomerDao dao =new CustomerDao();
//		Customer c = dao.display(21);
//		c.setCity("Delhi");
//		dao.update(c);

//		PersonDao dao = new PersonDao();
//		Person p= new Person();
//		p.setPersonName("John");
//		p.setPersonAge(25);
//		dao.addPerson(p);
		
//		Passport pass=new Passport();
//		pass.setPassportNo("P001");
//		pass.setIssueDate(LocalDate.of(2019, 05, 21));
//		pass.setExpiryDate(LocalDate.of(2029, 04, 22));
//		pass.setPlaceofIssue("Mumbai");
//		
//		PersonDao dao = new PersonDao();
//		dao.addPassportWithPerson(pass, 101);
		
//		AddressDao dao=new AddressDao();
//		Address address=new Address();
//		address.setCity("Mumbai");
//		address.setBuildingname("RoyalLifestyle");
//		dao.add(address);
		
//		User user= new User();
//		user.setDateofBirth(LocalDate.of(2019,12,15));
//		user.setName("Mark");
//		AddressDao dao=new AddressDao();
//		dao.addUserwithAddress(user, 121);
		
//		AccountDao dao = new AccountDao();
//		Account account= new Account();
//		account.setAccBalance(50000);
//		account.setAccType("Savings");
//		dao.addAccount(account);
		List<Transaction> transactions = new ArrayList<Transaction>();
				
		Transaction t1 = new Transaction();
		t1.setAmount(20000);
		t1.setTransType("Credit");
		transactions.add(t1);
		
		Transaction t2 = new Transaction();
		t2.setAmount(25000);
		t2.setTransType("Credit");
		transactions.add(t2);
		
		Transaction t3 = new Transaction();
		t3.setAmount(40000);
		t3.setTransType("Debit");
		transactions.add(t3);
		
		AccountDao dao = new AccountDao();
		dao.addTansactionWithAccount(transactions, 141);

	}
}
