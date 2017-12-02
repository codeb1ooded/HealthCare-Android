package com.codeb1ooded.digifest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by megha on 02/12/17.
 */

public class AttachImage extends AppCompatActivity {

    Button attachImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_screen);
        attachImage = (Button) findViewById(R.id.attach);
        attachImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                mySearch = ApiClientOmdb.getInterface().getMySearch(Constants.OMDB_API_KEY, b.getString(SEARCH_TITLE));
                mySearch.enqueue(new Callback<Search>() {
                    @Override
                    public void onResponse(Call<Search> call, Response<Search> response) {
                        progressDialog.cancel();
                        if (response.isSuccessful()) {
                            Search s = response.body();
                            if (s != null) {
                                Picasso.with(getActivity()).load(s.Poster).into(poster);
                                movieTitle.setText(s.title);
                                year.setText("(" + s.Year + ")");
                                genre.setText(s.genre);
                                duration.setText(s.duration);
                                plot.setText(s.plot);
                                imdbRating.setText(s.imdbRating+"/10");
                                releaseDate.setText(s.releaseDate);
                                actors.setText(s.actors);
                                director.setText(s.director);
                                writer.setText(s.writer);
                                language.setText(s.language);
                                metaScore.setText(s.metaScore);
                            }
                        } else {
                            Toast.makeText(getActivity(), response.code() + response.message(), Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Search> call, Throwable t) {
                        progressDialog.cancel();
                        Toast.makeText(getActivity(), "You are not connected to internet", Toast.LENGTH_SHORT).show();
                    }
                });
                 */
            }
        });
    }
}
