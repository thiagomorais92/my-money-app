package com.example;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/billingCycles")
public class BillingCycleController {

	@RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAll(){
			List<BillingCycle> billingCycles = BillingCyclesLoader.getDefaults();
			return new ResponseEntity<>(billingCycles,HttpStatus.ACCEPTED);
		}
	
	@RequestMapping( value="/{billingId}",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getBillingById(@PathVariable long billingId){
		BillingCycle billingFound = BillingCyclesLoader.findSpecifidBilling(billingId);
		return new ResponseEntity<>(billingFound,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method = RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveABilling(@RequestBody BillingCycle billingCycleToSave){
		BillingCyclesLoader.getDefaults().add(billingCycleToSave);
		return  new ResponseEntity<>(billingCycleToSave,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping( value="/{billingId}",method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> alterandoBillingId(@PathVariable long billingId){
		BillingCycle billingFound = BillingCyclesLoader.findSpecifidBilling(billingId);
		return new ResponseEntity<>(billingFound,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping( value="/{billingId}",method=RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteBillingId(@PathVariable long billingId){
		BillingCyclesLoader.deleteSpecifidBilling(billingId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/count",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> count(){
			int total = BillingCyclesLoader.getDefaults().size();
			return new ResponseEntity<>(total,HttpStatus.ACCEPTED);
		}
	@RequestMapping(value="/summary",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> summary(){
			Summary summary = BillingCyclesLoader.getSummary();
			return new ResponseEntity<>(summary,HttpStatus.ACCEPTED);
		}
	
}
