/**
 * Copyright 2012 J. Miguel P. Tavares
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
package org.bitpipeline.lib.units.base.temperature;

import junit.framework.TestCase;

import org.bitpipeline.lib.units.Unit;
import org.bitpipeline.lib.units.base.temperature.Kelvin;
import org.bitpipeline.lib.units.base.temperature.TemperatureDimension;
import org.junit.Test;

public class KelvinTest extends TestCase {
	@Test
	public void testNameAndSymbol () {
		Unit kelvin = Kelvin.unit ();
		assertEquals ("kelvin", kelvin.getName ());
		assertEquals ("K", kelvin.getSymbol ());
	}

	@Test
	public void testDimension () {
		Unit kelvin = Kelvin.unit ();
		assertTrue (kelvin.getDimension () instanceof TemperatureDimension);
	}

	@Test
	public void testIsUnique () {
		Unit kelvin = Kelvin.unit ();
		Unit kelvin2 = kelvin.getUnit ();
		assertTrue ("A unit must be a singleton, so only one instance should exist.", kelvin == kelvin2);
	}

	@Test
	public void testSIConvertion () {
		Unit kelvin = Kelvin.unit ();

		double dValue = Math.random ()*1000d;
		float fValue = (float) dValue;

		// Test the SI base unit
		assertEquals(dValue, kelvin.convertToSIBase (dValue), Double.MIN_NORMAL);
		assertEquals(fValue, kelvin.convertToSIBase (fValue), Float.MIN_NORMAL);

		assertEquals(dValue, kelvin.convertFromSIBase (dValue), Double.MIN_NORMAL);
		assertEquals(fValue, kelvin.convertFromSIBase (fValue), Float.MIN_NORMAL);
	}
}
