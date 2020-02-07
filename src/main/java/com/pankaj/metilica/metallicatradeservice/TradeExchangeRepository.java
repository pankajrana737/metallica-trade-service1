package com.pankaj.metilica.metallicatradeservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pankaj.metilica.metallicatradeservice.comtroller.TradeExchangeValue;

public interface TradeExchangeRepository extends JpaRepository<TradeExchangeValue,Integer>{

	@Query(value = "SELECT * FROM TRADE_EXCHANGE_VALUE u WHERE u.trade_status  = (?1) and u.side = (?2)",
		//	+ "or u.FROM_DATE=  (?3) or u.TO_DATE = (?4)", 
			  nativeQuery = true)
	List<TradeExchangeValue> findTradeByStatusAndNameNamedParamsNative(
			  
			//  @Param("FROM_DATE") String  FROM_DATE, @Param("TO_DATE") String TO_DATE,
			  @Param("trade_status") String  status, @Param("side") String side);

}
