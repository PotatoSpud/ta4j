package eu.verdelhan.tailtest.indicator.simple;

import eu.verdelhan.tailtest.Indicator;
import eu.verdelhan.tailtest.TimeSeries;

public class MaxPrice implements Indicator<Double> {

	private TimeSeries data;

	public MaxPrice(TimeSeries data) {
		this.data = data;
	}

	@Override
	public Double getValue(int index) {
		return data.getTick(index).getMaxPrice();
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}
}
