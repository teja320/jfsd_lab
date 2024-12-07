package com.example.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "order_table")
	public class order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "sid")
		private int order_id;
		@Column(name = "sproductname", nullable = false, length = 50)
		private String ProductName;
		@Column(name = "squantity", nullable = false, length = 10)
		private int Quantity;
		@Column(name = "sorderdate", nullable = false, length = 20)
		private String OrderDate;
//		@Column(name = "scustomer", nullable = false, length = 30)
		private String CustomerName;
		
		
		
		public int getOrder_id() {
			return order_id;
		}
		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public int getQuantity() {
			return Quantity;
		}
		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		public String getOrderDate() {
			return OrderDate;
		}
		public void setOrderDate(String orderDate) {
			OrderDate = orderDate;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}

	}