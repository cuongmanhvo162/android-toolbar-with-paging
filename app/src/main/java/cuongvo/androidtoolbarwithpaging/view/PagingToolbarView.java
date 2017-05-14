package cuongvo.androidtoolbarwithpaging.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import cuongvo.androidtoolbarwithpaging.R;

/**
 * Created by cuongvo on 5/14/17.
 */

public class PagingToolbarView extends LinearLayout {
    private Context mContext;

    public PagingToolbarView(Context context) {
        super(context);
        init(context);
    }

    public PagingToolbarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PagingToolbarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PagingToolbarView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.view_paging_toolbar, this);
    }

}
