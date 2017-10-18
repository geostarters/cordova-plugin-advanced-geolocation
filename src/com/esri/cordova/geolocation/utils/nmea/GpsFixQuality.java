/* 
 * GpsFixQuality.java
 * Copyright (C) 2010 Kimmo Tuukkanen
 * 
 * This file is part of Java Marine API.
 * <http://ktuukkan.github.io/marine-api/>
 * 
 * Java Marine API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Java Marine API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java Marine API. If not, see <http://www.gnu.org/licenses/>.
 */
//package net.sf.marineapi.nmea.util;
package com.esri.cordova.geolocation.utils.nmea;

/**
 * GpsFixQuality defines the supported fix quality types.
 * 
 * @author Kimmo Tuukkanen
 * @see FaaMode
 * @see GpsFixStatus
 * @see DataStatus
 */
public class GpsFixQuality {

	/** No GPS fix acquired. */
//	INVALID(0),
	public static final int INVALID = 0;

	/** Normal GPS fix, Standard Position Service (SPS). */
//	NORMAL(1),
	public static final int NORMAL = 1;

	/** Differential GPS fix. */
//	DGPS(2),
	public static final int DGPS = 2;
	/** Precise Positioning Service fix. */
//	PPS(3),
	public static final int PPS = 3;
	/** Real Time Kinematic */
//	RTK(4),
	public static final int RTK = 4;
	/** Float RTK */
//	FRTK(5),
	public static final int FRTK = 5;
	/** Estimated, dead reckoning (2.3 feature) */
//	ESTIMATED(6),
	public static final int ESTIMATED = 6;
	/** Manual input mode */
//	MANUAL(7),
	public static final int MANUAL = 7;
	/** Simulation mode */
//	SIMULATED(8);
	public static final int SIMULATED = 8;
	
	//public static final String[] = ["INVALID", "NORMAL"];
	
	private final int value;

	GpsFixQuality(int intValue) {
		value = intValue;
	}

	/**
	 * Returns the corresponding int indicator for fix quality.
	 * 
	 * @return Fix quality indicator value as indicated in sentences.
	 */
	public int toInt() {
		return value;
	}

	/**
	 * Get GpsFixQuality enum that corresponds the actual integer identifier
	 * used in the sentences.
	 * 
	 * @param val Status identifier value
	 * @return GpsFixQuality enum
	 */
	public static String valueOf(int val) {
//		for (GpsFixQuality gfq : values()) {
//			if (gfq.toInt() == val) {
//				return gfq;
//			}
//		}
//		return valueOf(String.valueOf(val));
		
		switch(val){
		case 0: return "INVALID";
		case 1: return "NORMAL";
		case 2: return "DGPS";
		case 3: return "PPS";
		case 4: return "RTK";
		case 5: return "FRTK";
		case 6: return "ESTIMATED";
		case 7: return "MANUAL";
		case 8: return "SIMULATED";
		default: return "INVALID";
		}
		
	}
}


