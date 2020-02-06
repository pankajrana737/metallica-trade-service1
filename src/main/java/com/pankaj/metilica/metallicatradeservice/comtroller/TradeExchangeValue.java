package com.pankaj.metilica.metallicatradeservice.comtroller;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class TradeExchangeValue {
		@Id
		private long ID;
		private SIDE Side;
		private BigDecimal price;
		private int quantity;
		private Date date;
		private  STATUS TradeStatus ;
		private String location;
		private String commodity;
		private Counterparty counterparty;
		private String from;
		private String to;
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
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public STATUS getTradeStatus() {
			return TradeStatus;
		}
		public void setTradeStatus(STATUS tradeStatus) {
			TradeStatus = tradeStatus;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
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
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public TradeExchangeValue(SIDE side, BigDecimal price, int quantity, Date date, STATUS tradeStatus,
				String location, String commodity, Counterparty counterparty, String from, String to) {
			super();
			Side = side;
			this.price = price;
			this.quantity = quantity;
			this.date = date;
			TradeStatus = tradeStatus;
			this.location = location;
			this.commodity = commodity;
			this.counterparty = counterparty;
			this.from = from;
			this.to = to;
		}
		public TradeExchangeValue() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		
}
