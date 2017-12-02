package com.codeb1ooded.digifest.networking;

import com.codeb1ooded.digifest.BlockData;
import com.codeb1ooded.digifest.EmptyClass;
import com.codeb1ooded.digifest.RecordModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by megha on 03/12/17.
 */

public interface ApiInterface {

    @GET("sfg/home")
    Call<EmptyClass> addBlock(@Query("user") String username, @Query("title") String title, @Query("name") String name,
                              @Query("age") int age, @Query("sex") String sex, @Query("others") String others,
                              @Query("image") String image);

    @GET("get_details")
    Call<RecordModel> getDetails(@Query("username") String username);

}
