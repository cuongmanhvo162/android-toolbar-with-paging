package cuongvo.androidtoolbarwithpaging.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cuongvo.androidtoolbarwithpaging.R;
import cuongvo.androidtoolbarwithpaging.adapter.holder.CarListViewHolder;
import cuongvo.androidtoolbarwithpaging.data.CarData;

/**
 * Created by cuongvo on 5/14/17.
 */

public class CarListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<CarData> mList;

    public CarListAdapter(Context context, List<CarData> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        LayoutInflater inflaterMainCategory = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflaterMainCategory.inflate(R.layout.adapter_player_list, parent, false);

        CarListViewHolder holder = new CarListViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CarData carData = mList.get(position);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
