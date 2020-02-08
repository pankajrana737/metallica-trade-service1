package com.pankaj.metilica.metallicatradeservice.comtroller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Sides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.pankaj.metilica.metallicatradeservice.TradeExchangeRepository;

@RestController
public class TradeController {
	
	@Autowired
	TradeExchangeRepository tradeRepo;
	
 @GetMapping(produces ="application/json",value= "/trades1")
 public List<TradeExchangeValue> getTradingExchnagesValue(@RequestParam String side,@RequestParam String fromDate,@RequestParam String toDate,@RequestParam String status) {
			Map<String, String> urlVariables= new HashMap<>();
			urlVariables.putIfAbsent("location", "delhi");
			LocationBean forObject = new RestTemplate().getForObject("http://localhost:5000/ref-data-service?location=", LocationBean.class, urlVariables= new HashMap<>());
	System.out.println(forObject);
			return  tradeRepo.findTradeByStatusAndNameNamedParamsNative(status,side);
	}
 
 
 	@GetMapping("/trades/getAll")
 	public List<TradeExchangeValue> getAllRecords(){
 		return tradeRepo.findAll();
 	}
 	
 	
 	@GetMapping("/trades")
 	public ModelAndView index () {
 	    ModelAndView modelAndView = new ModelAndView();
 	    modelAndView.setViewName("index");
 	    return modelAndView;
 	}
}
