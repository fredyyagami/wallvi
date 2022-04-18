package com.arandevs.wallvi.callbacks;

import com.arandevs.wallvi.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CallbackPage {

    public String kind;
    public List<Post> items = new ArrayList<>();
    public String nextPageToken;
    public String etag;

}
