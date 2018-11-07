package com.realtime.Assignment2;

public class dataExcel {
	
private String No, Name, FideID, FED, Rtg, Club_City;

public dataExcel( String No, String Name, String FideID, String FED, String Rtg, String Club_City) {
	 
	 this.No = No;
	 this.Name = Name;
	 this.FideID = FideID;
	 this.FED = FED;
	 this.Rtg = Rtg;
	 this.Club_City = Club_City;
}

public void setNo(String No) {
	 this.No = No;
	 
}

public String getNo() {
	 return No;
}

public void setName(String Name) {

	 this.Name = Name;	 
}

public String getName() {
	 return Name;
}

public void setFideID(String FideID) {

	 this.FideID = FideID;	 
}

public String getFideID() {
	 return FideID;
}

public void setFED(String FED) {

	 this.FED = FED;	 
}

public String getFED() {
	 return FED;
}

public void setRtg(String Rtg) {

	 this.Rtg = Rtg;	 
}

public String getRtg() {
	 return Rtg;
}

public void setClub_City(String Club_City) {

	 this.Club_City = Club_City;	 
}

public String getClub_City() {
	 return Club_City;
}

}

