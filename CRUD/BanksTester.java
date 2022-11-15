class BanksTester {

		public static void main(String[] args) {
			Banks.setbanks("Allahabad Bank");
			Banks.setbanks("Axis Bank");
			Banks.setbanks("Canara Bank");
			Banks.setbanks("Andhra Bank");
			Banks.setbanks("Bank of Baroda");
			Banks.setbanks("City Union Bank");
			Banks.getbanks();
			Banks.updatebanks("akash","Bank of Baroda");
			Banks.getbanks();
			Banks.updatebanks("sharu",4);
			Banks.getbanks();
				
			}

}