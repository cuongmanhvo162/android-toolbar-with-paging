package cuongvo.androidtoolbarwithpaging;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import cuongvo.androidtoolbarwithpaging.adapter.CarListAdapter;
import cuongvo.androidtoolbarwithpaging.util.DataUtil;
import cuongvo.androidtoolbarwithpaging.util.RecycleViewUtil;

/**
 * Created by cuongvo on 5/14/17.
 */

public class CarDetailActivity extends Activity {

    private RecyclerView mCarMenuList;
    private CarListAdapter mCarListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        mCarMenuList = (RecyclerView)findViewById(R.id.activity_car_detail_menu);
        mCarMenuList.setLayoutManager(RecycleViewUtil.createHorizontalLayoutManager(this));

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(mCarMenuList);
    }

    @Override
    protected void onStart() {
        super.onStart();

        createCarListMenu();
    }

    private void createCarListMenu(){
        mCarListAdapter = new CarListAdapter(this, DataUtil.getCarList(this));
        mCarMenuList.setAdapter(mCarListAdapter);
        mCarListAdapter.notifyDataSetChanged();
    }
}
