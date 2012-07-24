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
package org.bitpipeline.lib.units;

final public class SquareMeterUnit extends AbstractUnit {
	static final private SquareMeterUnit UNIT = new SquareMeterUnit ();

	private SquareMeterUnit() {
		super("m\u00b2", LengthDimension.dimension(), LengthDimension.dimension());
	}

	static public Unit unit () {
		return SquareMeterUnit.UNIT;
	}

	public Unit getUnit() {
		return SquareMeterUnit.unit ();
	}

	@Override
	protected double convertValueToSiBase (final double value) {
		return value;
	}

	@Override
	protected double convertValueFromSiBase (final double value) {
		return value;
	}
}
