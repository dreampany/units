/**
 * Copyright 2013 J. Miguel P. Tavares
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package org.bitpipeline.lib.units.deriv;

/** The standard SI prefixes (based on power of 10) */
public enum Prefix {
	/** 10^24 */
	YOTTA(24, "yotta", "Y"),
	/** 10^21 */
	ZETA(21, "zetta", "Z"),
	/** 10^18 */
	EXA(18, "exa", "E"),
	/** 10^15 */
	PETA(15, "peta", "P"),
	/** 10^12 */
	TERA(12, "tera", "T"),
	/** 10^9 */
	GIGA(9, "giga", "G"),
	/** 10^6 */
	MEGA(6, "mega", "M"),
	/** 10^3 */
	KILO(3, "kilo", "K"),
	/** 10^2 */
	HECTO(2, "hecto", "H"),
	/** 10^1 */
	DECA(1, "deca", "D"),
	/** 10^0 */
	IDENT(0, "", ""),
	/** 10^-1 */
	DECI(-1, "deci", "d"),
	/** 10^-2 */
	CENTI(-2, "centi", "c"),
	/** 10^-3 */
	MILLI(-3, "milli", "m"),
	/** 10^-6 */
	MICRO(-6, "micro", "μ"),
	/** 10^-9 */
	NANO(-9, "nano", "n"),
	/** 10^-12 */
	PICO(-12, "pico", "p"),
	/** 10^-15 */
	FEMTO(-15, "femto", "f"),
	/** 10^-18 */
	ATTO(-18, "atto", "a"),
	/** 10^-21 */
	ZEPTO(-21, "zepto", "z"),
	/** 10^-24 */
	YOCTO(-24, "yocto", "y");

	final private int power;
	final private String prefix;
	final private String symbol;

	private Prefix (final int power, final String prefix, final String symbol) {
		this.power = power;
		this.prefix = prefix;
		this.symbol = symbol;
	}

	String getPrefix () {return this.prefix;}
	String getSymbol () {return this.symbol;}
	float getFloatMult (float cardinality)  {
		return ((float) Math.pow (10.0, this.power * cardinality));
	}
	double getDoubleMult (double cardinality) {
		return Math.pow (10.0, this.power * cardinality);
	}
}