package com.techelevator.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.calculator.TaxCalculator;

@RestController
public class ApiController {
	
//	private class TaxData{
//		public String zipCode;
//		public BigDecimal tax;
//		public BigDecimal subtotal;
//	}

	/**
	 * ApiController allows us to separate our
	 * controllers that handle view logic from controllers that provide output to clients making
	 * asynchronous HTTP requests.
	 */
	@RequestMapping(path="/api/getTax", method=RequestMethod.GET)
    public BigDecimal getTax(@RequestParam String billingZipCode, @RequestParam double subtotal) {
		double taxRate = TaxCalculator.getTaxRate(billingZipCode);
		BigDecimal taxTotal = new BigDecimal(subtotal * taxRate).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        return taxTotal;
    }

	
//	@RequestMapping(path="/api/getTax", method=RequestMethod.GET)
//    public TaxData getTax(@RequestParam String billingZipCode, @RequestParam double subtotal) {
//		double taxRate = TaxCalculator.getTaxRate(billingZipCode);
//		TaxData data = new TaxData();
//		data.subtotal = new BigDecimal(subtotal).setScale(2, BigDecimal.ROUND_HALF_DOWN);
//		data.zipCode = billingZipCode;
//		data.tax =  new BigDecimal(subtotal * taxRate).setScale(2, BigDecimal.ROUND_HALF_DOWN);
//      return data;
//    }
}
