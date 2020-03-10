package data;

public 
	enum Province {
		ONTARIO("Ontario"),
		QUEBEC("Quebec"),
		NOVA_SCOTIA("Nova Scotia"),
		NEW_BRUNSWICK("New Brunswick"),
		MANITOBA("Manitoba"),
		BRITISH_COLUMBIA("British Columbia"),
		PRICE_EDWARD_ISLAND("Prince Edward Island"),
		SASKATCHEWAN("Saskatchewan"),
		ALBERTA("Alberta"),
		NEWFOUNDLAND_AND_LABRADOR("Newfoundland and Labrador"),
		NORTHERN_TERRITORIES("Northern Territories"),
		YUKON("Yukon"),
		NUNAVUT("Nunavut");
		
		private final String toString;

	    private Province(String toString) {
	         this.toString = toString;
	    }

	    public String toString(){
	         return toString;
	    }
	}

