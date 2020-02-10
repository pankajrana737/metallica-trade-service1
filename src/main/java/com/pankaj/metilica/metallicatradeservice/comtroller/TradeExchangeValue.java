package com.pankaj.metilica.metallicatradeservice.comtroller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.Type;



@Entity

public class TradeExchangeValue implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 2884652353330270495L;
		@Id
		private long ID;
		@Enumerated(EnumType.STRING)
		private SIDE Side;
		private BigDecimal price;
		private int quantity;
		 @Enumerated(EnumType.STRING)
		private  STATUS TradeStatus ;
		private LocationBean location;
		private String commodity;
		
		private Counterparty counterparty;
		@Column(name = "From_date")
		private String fromDate;
		@Column(name = "To_date")
		private String toDate;
		
		public SIDE getSide() {
			return Side;
		}
		public void setSide(SIDE side) {
			Side = side;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		@Enumerated(EnumType.STRING)
		public STATUS getTradeStatus() {
			return TradeStatus;
		}
		public void setTradeStatus(STATUS tradeStatus) {
			TradeStatus = tradeStatus;
		}
		public LocationBean getLocation() {
			return location;
		}
		public void setLocation(LocationBean location) {
			this.location = location;
		}
		public String getCommodity() {
			return commodity;
		}
		public void setCommodity(String commodity) {
			this.commodity = commodity;
		}
		public Counterparty getCounterparty() {
			return counterparty;
		}
		public void setCounterparty(Counterparty counterparty) {
			this.counterparty = counterparty;
		}
		public String getfromDateDate() {
			return fromDate;
		}
		public void setfromDateDate(String fromDateDate) {
			this.fromDate = fromDate;
		}
		public String gettoDate() {
			return toDate;
		}
		public void settoDate(String toDate) {
			this.toDate = toDate;
		}
		public TradeExchangeValue(SIDE side, BigDecimal price, int quantity,STATUS tradeStatus,
				LocationBean location, String commodity, Counterparty counterparty, String fromDate, String toDate) {
			super();
			Side = side;
			this.price = price;
			this.quantity = quantity;
		
			this.TradeStatus = tradeStatus;
			this.location = location;
			this.commodity = commodity;
			this.counterparty = counterparty;
			
			this.fromDate = fromDate;
			this.toDate = toDate;
		}
		public TradeExchangeValue() {
			super();
			// toDateDO AutoDate-generated constructoDater stub
		}
		
		

		
}
