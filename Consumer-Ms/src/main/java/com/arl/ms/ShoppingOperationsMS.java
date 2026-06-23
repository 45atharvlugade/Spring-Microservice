package com.arl.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.client.BillingMsClientComp;

@RestController
@RequestMapping("/shopping")
public class ShoppingOperationsMS {
	@Autowired
	private BillingMsClientComp client;
	

	@GetMapping("/purchase")
	public ResponseEntity<String> doShopping(){
		String msg="Shirt,Trouser,items are pruchased";
		
		// invoke billing ms client componenent.
		ResponseEntity<?> resp=client.invokeDoBilling();
		String result=msg+"....."+resp.getBody();
		
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
}
