package org.bitpipeline.lib.units;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUnit implements Unit {
	final protected transient List<Dimension> dimensions = new ArrayList<Dimension> ();
	protected transient String symbol = "";

	public AbstractUnit (final String symbol, final Dimension...dimensions) {
		this.symbol = symbol;
		
		for (Dimension dim : dimensions) {
			this.dimensions.add(dim);
			dim.addUnit(this);
		}
	}
	
	public List<Dimension> getDimensions () {
		return this.dimensions;
	}

	public String getSymbol () {
		return this.symbol;
	}
	
	public boolean isEquivalent(final Unit unit) {
		return this.dimensions.equals(unit.getDimensions());
	}
	
	abstract double convertValueToSiBase (final double value);
	abstract double convertValueFromSiBase (final double value);
	
	public Number convertToSIBase(final Number value) {
		double val = value.doubleValue();
		final double result;
		if (Double.isNaN(val) || Double.isInfinite(val))
			result = val;
		else 
			result = convertValueToSiBase(value.doubleValue());
		if (value instanceof Byte)
			return Byte.valueOf ((byte) result);
		if (value instanceof Double)
			return Double.valueOf (result);
		if (value instanceof Float)
			return Float.valueOf ((float) result);
		if (value instanceof Integer)
			return Integer.valueOf ((int) result);
		if (value instanceof Long)
			return Long.valueOf ((long) result);
		if (value instanceof Short)
			return Short.valueOf ((short) result);
		return null;
	}

	public Number convertFromSIBase(final Number value) {
		double val = value.doubleValue();
		final double result;
		if (Double.isNaN(val) || Double.isInfinite(val))
			result = val;
		else 
			result = convertValueFromSiBase(value.doubleValue());
		if (value instanceof Byte)
			return Byte.valueOf ((byte) result);
		if (value instanceof Double)
			return Double.valueOf (result);
		if (value instanceof Float)
			return Float.valueOf ((float) result);
		if (value instanceof Integer)
			return Integer.valueOf ((int) result);
		if (value instanceof Long)
			return Long.valueOf ((long) result);
		if (value instanceof Short)
			return Short.valueOf ((short) result);
		return null;
	}
	
	public String toString () {
		return getSymbol();
	}
}
