package cuongvo.androidtoolbarwithpaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import cuongvo.androidtoolbarwithpaging.adapter.CarBrandListAdapter;
import cuongvo.androidtoolbarwithpaging.util.DataUtil;
import cuongvo.androidtoolbarwithpaging.util.RecycleViewUtil;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mCarBrandList;
    private CarBrandListAdapter mCarBrandListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCarBrandList = (RecyclerView) findViewById(R.id.activity_main_car_brand_list);
        mCarBrandList.setLayoutManager(RecycleViewUtil.createVerticalLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();

        createCarBrandList();
    }

    private void createCarBrandList() {
        mCarBrandListAdapter = new CarBrandListAdapter(this, DataUtil.getCarBrandList(this));
        mCarBrandList.setAdapter(mCarBrandListAdapter);
        mCarBrandListAdapter.notifyDataSetChanged();
    }

}
