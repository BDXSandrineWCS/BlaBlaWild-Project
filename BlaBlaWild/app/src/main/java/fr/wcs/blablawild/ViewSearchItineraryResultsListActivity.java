package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        // Get the Intent that started this activity (from ItinerarySearchActivity) and extract the extra (departure destination and dateSetListener)
        Intent intent = getIntent();
        String departure = intent.getStringExtra("EXTRA_DEPARTURE");
        String destination = intent.getStringExtra("EXTRA_DESTINATION");
        String date = intent.getStringExtra("EXTRA_DATE");
        String title="";
        if ((departure != null) && (destination!= null)) title = (departure + " >> " + destination);
        this.setTitle(title);

        // du code déjà existant peut être contenu avant cette ligne !

        ListView listTrip = findViewById(R.id.list_trip);
        ArrayList<TripModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat(getResources().getString(R.string.date_and_hours_format_text));

        try {
            results.add(new TripModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
        } catch (ParseException e) {
            e.getMessage();
        }
        TripResultAdapter adapter = new TripResultAdapter(this, results);
        listTrip.setAdapter(adapter);

        // du code déjà existant peut être contenu après cette ligne !

    }
}
