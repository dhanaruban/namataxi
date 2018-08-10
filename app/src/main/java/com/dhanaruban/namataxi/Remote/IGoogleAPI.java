package com.dhanaruban.namataxi.Remote;

import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
