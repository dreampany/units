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
package org.bitpipeline.lib.units.base.electric;

import org.bitpipeline.lib.units.AbstractUnit;
import org.bitpipeline.lib.units.Unit;

final public class Ampere extends AbstractUnit {
	static final private Ampere UNIT = new Ampere ();

	private Ampere() {
		super("ampere", "A", ElectricCurrentDimension.dimension ());
	}

	static public Unit unit() {
		return Ampere.UNIT;
	}

	public Unit getUnit() {
		return Ampere.UNIT;
	}

	@Override
	public float convertToSIBase (float value) {
		return value;
	}

	@Override
	public double convertToSIBase (double value) {
		return value;
	}

	@Override
	public float convertFromSIBase (float value) {
		return value;
	}

	@Override
	public double convertFromSIBase (double value) {
		return value;
	}
}
