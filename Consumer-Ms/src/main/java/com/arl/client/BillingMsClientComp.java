package com.arl.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingMsClientComp {

	@Autowired
	private DiscoveryClient client;
	
	public ResponseEntity<?> invokeDoBilling(){
		// get target ms service instance from eureka server.
		List<ServiceInstance> instances=client.getInstances("PROVIDER-MS-01");
		
		 if (instances.isEmpty()) {
		        return ResponseEntity.internalServerError()
		                .body("Billing Service Not Available");
		    }
		
		// get EndPoint details
		URI uri=instances.get(0).getUri(); // gives http://localhost:7071
		String urlInfo=uri+"/billapi/bill"; 
		
		// Create the Rest Template class object.
		
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> respo=template.exchange(urlInfo, HttpMethod.GET, null, String.class);
		return respo;
		
	}
}
