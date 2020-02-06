package com.pankaj.metilica.metallicatradeservice.comtroller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
	
	
 @GetMapping(produces ="application/json",value= "/trades")
 public List<TradeExchangeValue> getTradingExchnagesValue(@RequestParam String side,@RequestParam String fromDate,@RequestParam String toDate,@RequestParam String status) {
	
	 STATUS curStatus = STATUS.valueOf(status);
	 Date localDate = new Date();
	Counterparty counterparty = new Counterparty("AAPL", "Apple Inc.");
	Counterparty counterparty1 = new Counterparty("Samsumng", "Samsung limted");
	Counterparty counterparty2 = new Counterparty("Amazon", "Amazon Inc.");
	List<TradeExchangeValue> list= new ArrayList<TradeExchangeValue>();
	list.add(new TradeExchangeValue(SIDE.valueOf(side), new BigDecimal(1000),2000 ,localDate, 
			curStatus, "India", "AL", counterparty,fromDate,toDate));
	list.add(new TradeExchangeValue(SIDE.valueOf(side), new BigDecimal(1000),1203 ,localDate, 
			curStatus, "China", "AL", counterparty1,fromDate,toDate));
	list.add(new TradeExchangeValue(SIDE.valueOf(side), new BigDecimal(500),1000 ,localDate, 
			curStatus, "USA", "AL", counterparty2,fromDate,toDate));
	return list;
	}
 
}
