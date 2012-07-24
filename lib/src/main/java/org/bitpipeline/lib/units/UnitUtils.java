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

import java.util.ArrayList;
import java.util.List;

public class UnitUtils {
	static public List<Unit> getEquivalentUnits (Unit unit) {
		ArrayList<Unit> unitList = new ArrayList<Unit> ();

		if (unit.getDimensions().size() == 0)
			return unitList;

		Dimension dim = unit.getDimensions().get(0);
		for (Unit otherUnit : dim.getUnits()) {
			if (unit.isEquivalent(otherUnit)) {
				unitList.add(otherUnit);
			}
		}
		return unitList;
	}
}
