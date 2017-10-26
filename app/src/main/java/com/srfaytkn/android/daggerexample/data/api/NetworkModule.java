package com.srfaytkn.android.daggerexample.data.api;

import android.annotation.SuppressLint;
import android.app.Application;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.srfaytkn.android.daggerexample.utils.Constants.BASE_URL;
import static com.srfaytkn.android.daggerexample.utils.Constants.CACHE_SIZE;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    Cache provideHttpCache(Application application) {
        return new Cache(application.getCacheDir(), CACHE_SIZE);
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor provideHttpInterceptor() {
        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Provides
    @Singleton
    @Named("headerInterceptor")
    Interceptor ProvideHeaderInterceptor() {
        return chain -> {
            Request original = chain.request();

            // Customize the request
            @SuppressLint("DefaultLocale")
            Request request = original.newBuilder()
                    .header("Content-Type", "application/json")
                    .header("User-Agent", "benim-lan-ben")
//                    .header("Cache-Control", String.format("max-age=%d", CACHE_TIME))
                    .build();

            Response response = chain.proceed(request);
            response.cacheResponse();
            return response;
        };
    }


    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient(@Named("headerInterceptor") Interceptor headerInterceptor,
                                     HttpLoggingInterceptor httpLoggingInterceptor,
                                     Cache cache) {
        return new OkHttpClient.Builder()
                .addInterceptor(headerInterceptor)
                .addInterceptor(httpLoggingInterceptor)
                .cache(cache)
                .build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
