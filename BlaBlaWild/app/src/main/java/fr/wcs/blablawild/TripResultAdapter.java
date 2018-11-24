package fr.wcs.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TripResultAdapter extends ArrayAdapter<TripModel> {


    public TripResultAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TripModel trip = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
        }
        // Lookup view for data population
        TextView firstname = (TextView) convertView.findViewById(R.id.textViewFirstnameItem);
        TextView lastname = (TextView) convertView.findViewById(R.id.textViewLastnameItem);
        TextView date = (TextView) convertView.findViewById(R.id.textViewDateItem);
        TextView price = (TextView) convertView.findViewById(R.id.textViewPriceItem);
        // Populate the data into the template view using the data object
        firstname.setText(trip.getFirstname());
        lastname.setText(trip.getLastname());
        date.setText(dateToString(trip.getDateTrip()));
        price.setText(String.valueOf(trip.getPrice()));
        // Return the completed view to render on screen
        return convertView;
    }

    public String dateToString(Date date){
        SimpleDateFormat expressionFormat = new SimpleDateFormat(getContext().getResources().getString(R.string.date_and_hours_format_text));
        return expressionFormat.format(date);
    }

}
