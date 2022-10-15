class Address{

	private int houseNo;
	private String streetName;
	private String locality;
	private String city;
	private int pinCode;

	public Address(int houseNo,String streetName,String locality ,String city,int pinCode){
		this.houseNo=houseNo;
		this.streetName=streetName;
		this.locality=locality;
		this.city=city;
		this.pinCode=pinCode;
	}
	void getAddress(){
		System.out.println("****Address****");
		System.out.println(" houseNo:"+houseNo+"\n streetName:"+streetName+"\n locality:"+locality+"\n city:"+city+"\n pinCode:"+pinCode);
	}
}