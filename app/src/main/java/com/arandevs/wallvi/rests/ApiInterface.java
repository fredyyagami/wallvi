package com.arandevs.wallvi.rests;

import com.arandevs.wallvi.callbacks.CallbackConfig;
import com.arandevs.wallvi.callbacks.CallbackLabel;
import com.arandevs.wallvi.callbacks.CallbackPage;
import com.arandevs.wallvi.callbacks.CallbackPageDetail;
import com.arandevs.wallvi.callbacks.CallbackPost;
import com.arandevs.wallvi.callbacks.CallbackPostDetail;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ApiInterface {

    String CACHE = "Cache-Control: max-age=0";
    String AGENT = "Data-Agent: Blogger Wallpaper App";

    @Headers({CACHE, AGENT})
    @GET
    Call<CallbackConfig> getJsonUrl(@Url String url);

    @Headers({CACHE, AGENT})
    @GET("uc?export=download")
    Call<CallbackConfig> getDriveJsonFileId(
            @Query("id") String id
    );

    @Headers({CACHE, AGENT})
    @GET("posts/default?alt=json")
    Call<CallbackLabel> getLabel();

    @Headers({CACHE, AGENT})
    @GET("posts")
    Call<CallbackPost> getPosts(
            @Query("orderBy") String orderBy,
            @Query("key") String key,
            @Query("maxResults") int maxResults,
            @Query("pageToken") String pageToken
    );

    @Headers({CACHE, AGENT})
    @GET(".")
    Call<CallbackPostDetail> getPostDetail(
            @Query("key") String key
    );

    @Headers({CACHE, AGENT})
    @GET("posts")
    Call<CallbackPost> getCategoryDetail(
            @Query("labels") String labels,
            @Query("orderBy") String orderBy,
            @Query("key") String key,
            @Query("pageToken") String pageToken
    );

    @Headers({CACHE, AGENT})
    @GET("posts")
    Call<CallbackPost> getRelatedPosts(
            @Query("labels") String labels,
            @Query("orderBy") String orderBy,
            @Query("key") String key
    );

    @Headers({CACHE, AGENT})
    @GET("posts/search")
    Call<CallbackPost> getSearchPosts(
            @Query("q") String q,
            @Query("key") String key
    );

    @Headers({CACHE, AGENT})
    @GET("pages")
    Call<CallbackPage> getPages(
            @Query("key") String key,
            @Query("pageToken") String pageToken
    );

    @Headers({CACHE, AGENT})
    @GET(".")
    Call<CallbackPageDetail> getPageDetail(
            @Query("key") String key
    );

    @Streaming
    @GET
    Call<ResponseBody> downloadFileWithDynamicUrl(
            @Url String fileUrl
    );

}