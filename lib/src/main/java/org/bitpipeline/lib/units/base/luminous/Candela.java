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
package org.bitpipeline.lib.units.base.luminous;

import org.bitpipeline.lib.units.AbstractUnit;
import org.bitpipeline.lib.units.Unit;

final public class Candela extends AbstractUnit {
	static final private Candela UNIT = new Candela ();

	private Candela() {
		super("candela", "cd", LuminousIntensityDimension.dimension ());
	}

	static public Unit unit() {
		return Candela.UNIT;
	}

	public Unit getUnit() {
		return Candela.UNIT;
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
