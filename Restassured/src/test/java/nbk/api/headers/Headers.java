package nbk.api.headers;

import java.util.HashMap;

import nbk.api.utilobjects.Constant;

public class Headers {
		
		
		public HashMap<String, ?> JsonHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_TYPE, Constant.APPLICATION_JSON);
	        return headers;
	    }

		


}
