package com.model;


	public class Customer {
		private int custId;
		private String custName;
		
		public Customer() {
			
		}
		public Customer(int custId, String custName) {
			super();
			this.custId = custId;
			this.custName = custName;
		}
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", custName=" + custName + "]";
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		
	}


