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
package org.bitpipeline.lib.units.base.time;

import junit.framework.TestCase;

import org.bitpipeline.lib.units.Unit;
import org.bitpipeline.lib.units.base.time.Second;
import org.bitpipeline.lib.units.base.time.TimeDimension;
import org.junit.Test;

public class SecondTest extends TestCase {
	@Test
	public void testNameAndSymbol () {
		Unit second = Second.unit ();
		assertEquals ("second", second.getName ());
		assertEquals ("s", second.getSymbol ());
	}

	@Test
	public void testDimension () {
		Unit second = Second.unit ();
		assertTrue (second.getDimension () instanceof TimeDimension);
	}

	@Test
	public void testIsUnique () {
		Unit second = Second.unit ();
		Unit second2 = second.getUnit ();
		assertTrue ("A unit must be a singleton, so only one instance should exist.", second == second2);
	}

	@Test
	public void testSIConvertion () {
		Unit second = Second.unit ();

		double dValue = Math.random ()*1000d;
		float fValue = (float) dValue;

		// Test the SI base unit
		assertEquals(dValue, second.convertToSIBase (dValue), Double.MIN_NORMAL);
		assertEquals(fValue, second.convertToSIBase (fValue), Float.MIN_NORMAL);

		assertEquals(dValue, second.convertFromSIBase (dValue), Double.MIN_NORMAL);
		assertEquals(fValue, second.convertFromSIBase (fValue), Float.MIN_NORMAL);
	}
}
