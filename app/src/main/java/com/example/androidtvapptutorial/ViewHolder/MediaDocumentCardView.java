package com.example.androidtvapptutorial.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.BaseCardView;
import com.example.androidtvapptutorial.DataModel.MediaData;
import com.example.androidtvapptutorial.R;

public class MediaDocumentCardView extends BaseCardView {

    public MediaDocumentCardView(Context context) {
        super(context, null, com.example.androidtvapptutorial.R.style.TextCardStyle);
        LayoutInflater.from(getContext()).inflate(R.layout.item_document_card, this);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void updateView(MediaData mediaCategory) {
        TextView textTitle = findViewById(R.id.text_title);
        //TextView textDescription = findViewById(com.example.androidtvapptutorial.R.id.text_description);

        textTitle.setText(mediaCategory.getTitle());
        //textDescription.setText(mediaCategory.getDescription());
    }
}
