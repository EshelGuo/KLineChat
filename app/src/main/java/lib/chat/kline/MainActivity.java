package lib.chat.kline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import lib.chat.kline.chart.KLineChart;

public class MainActivity extends AppCompatActivity {

	private KLineChart mKlineChart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mKlineChart = findViewById(R.id.kline_chart);
	}
}
