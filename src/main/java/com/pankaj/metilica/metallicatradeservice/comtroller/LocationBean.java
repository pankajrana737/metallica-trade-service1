package com.pankaj.metilica.metallicatradeservice.comtroller;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class LocationBean {

	
	private long locationId;	
	
	private String locationName;
		private float latitude;
		private float longitude;
		@JsonIgnore
		public long getId() {
			return locationId;
		}
		public void setId(long id) {
			this.locationId = id;
		}
		public LocationBean(long locationId, String locationName, float latitude, float longitude) {
			super();
			this.locationId = locationId;
			this.locationName = locationName;
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public String getLocationName() {
			return locationName;
		}
		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}
		public float getLatitude() {
			return latitude;
		}
		public void setLatitude(float latitude) {
			this.latitude = latitude;
		}
		public float getLongitude() {
			return longitude;
		}
		public void setLongitude(float longitude) {
			this.longitude = longitude;
		}
		public LocationBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "LocationBean [id=" + locationId + ", locationName=" + locationName + ", latitude=" + latitude + ", longitude="
					+ longitude + "]";
		}
}

