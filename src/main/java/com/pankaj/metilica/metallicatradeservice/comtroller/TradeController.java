package com.pankaj.metilica.metallicatradeservice.comtroller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.pankaj.metilica.metallicatradeservice.TradeExchangeRepository;

@RestController
public class TradeController {
	
	@Autowired
	TradeExchangeRepository tradeRepo;
	
 @GetMapping(produces ="application/json",value= "/trades1")
 public List<TradeExchangeValue> getTradingExchnagesValue(@RequestParam String side,@RequestParam String fromDate,@RequestParam String toDate,@RequestParam String status) {
			

			HttpHeaders headers = new HttpHeaders();
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
			String url = "http://localhost:5000/ref-data-service";
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("location","101");
			HttpEntity<?> entity = new HttpEntity<>(headers);

			HttpEntity<LocationBean> response = new RestTemplate().exchange(
			        builder.toUriString(), 
			        HttpMethod.GET, 
			        entity, 
			        LocationBean.class);
			
			tradeRepo.findTradeByStatusAndNameNamedParamsNative(status,side).forEach(s->System.out.println(s.getLocation()));
				List<TradeExchangeValue> filteredData = tradeRepo.findTradeByStatusAndNameNamedParamsNative(status,side)
				.stream().filter( t->t.getLocation().getLocationName().equalsIgnoreCase(response.getBody().getLocationName()) )
				.collect(Collectors.toList());
	
			return filteredData ;
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
