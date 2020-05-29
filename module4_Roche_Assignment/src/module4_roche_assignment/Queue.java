/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4_roche_assignment;

import java.util.*;

public class Queue {
	
	private class Customer {
		private int departureTime;
		private int number;
		
		public Customer(int n, int departure){
			this.number = n;
			this.departureTime = departure;
		}
		
		public int getDepartureTime(){
			return departureTime;
		}
		
		public int getCustomer(){
			return this.number;
		}
	}

	private LinkedList<Customer> Customers;
	
	public Queue(){
		Customers = new LinkedList<Customer>();
	}
	
	public void insert(int n,int departure){
		Customers.add(new Customer(n, departure));
	}
	
	public Customer remove(){
		Customer A = Customers.removeFirst();
		return A;
	}
	
	public Customer firstCustomer(){
		return Customers.peekFirst();
	}
	
	public Customer lastCustomer(){
		return Customers.peekLast();
	}
	
	public int departure(){
		return Customers.peekFirst().getDepartureTime();
	}
	
	public int CustomerNumber(){
		return Customers.peekFirst().getCustomer();
	}
	
	
	
	public boolean search(int n){
		Customer[] L;
		L = (Customer[]) Customers.toArray();
		for(int i = 0; i < L.length; i++){
			if(L[i].getCustomer() == n){
				return true;
			}
		}
		return false;
	}
	
	public boolean empty(){
		return Customers.isEmpty();
	}
	
	public int QueueSize(){
		return Customers.size();
	}
	
	
	
	
}
