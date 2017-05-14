package cuongvo.androidtoolbarwithpaging.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import cuongvo.androidtoolbarwithpaging.R;

/**
 * Created by cuongvo on 5/14/17.
 */

public class CarListViewHolder extends RecyclerView.ViewHolder {
    public TextView mName;

    public CarListViewHolder(View itemView) {
        super(itemView);

        mName = (TextView)itemView.findViewById(R.id.adapter_car_list_name);
    }
}
