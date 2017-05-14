package cuongvo.androidtoolbarwithpaging.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import cuongvo.androidtoolbarwithpaging.R;

/**
 * Created by cuongvo on 5/14/17.
 */

public class CarBrandListViewHolder extends RecyclerView.ViewHolder {
    public TextView mName;

    public CarBrandListViewHolder(View itemView) {
        super(itemView);

        mName = (TextView)itemView.findViewById(R.id.adapter_car_brand_name);
    }
}
