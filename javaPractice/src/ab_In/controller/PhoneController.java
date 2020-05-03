package ab_In.controller;

import ab_In.model.vo.GalaxyNote9;
import ab_In.model.vo.Phone;
import ab_In.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {
		
		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)arr[i]).printInformation();
			}
			if(arr[i] instanceof V40) {
				result[i] = ((V40)arr[i]).printInformation();
			}
		}
		return result;
	}
}
