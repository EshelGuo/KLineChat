package lib.chat.kline.chart;

import android.content.Context;
import android.util.AttributeSet;

import com.github.mikephil.charting.charts.CombinedChart;

/**
 * <br>createBy guoshiwen
 * <br>createTime: 2020/6/8 14:34
 * <br>desc: TODO
 */
public class KLineChart extends CombinedChart {

	public KLineChart(Context context) {
		this(context, null);
	}

	public KLineChart(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public KLineChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
}
