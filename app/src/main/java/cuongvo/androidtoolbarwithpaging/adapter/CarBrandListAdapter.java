package cuongvo.androidtoolbarwithpaging.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cuongvo.androidtoolbarwithpaging.R;
import cuongvo.androidtoolbarwithpaging.adapter.holder.CarBrandListViewHolder;
import cuongvo.androidtoolbarwithpaging.data.CarBrandData;

/**
 * Created by cuongvo on 5/14/17.
 */

public class CarBrandListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<CarBrandData> mList;

    public CarBrandListAdapter(Context context, List<CarBrandData> list){
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        LayoutInflater inflaterMainCategory = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflaterMainCategory.inflate(R.layout.adapter_car_list, parent, false);

        CarBrandListViewHolder holder = new CarBrandListViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CarBrandData carBrandData = mList.get(position);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
