package com.arandevs.wallvi.callbacks;

import com.arandevs.wallvi.models.Ads;
import com.arandevs.wallvi.models.App;
import com.arandevs.wallvi.models.Blog;
import com.arandevs.wallvi.models.Category;
import com.arandevs.wallvi.models.Notification;

import java.util.ArrayList;
import java.util.List;

public class CallbackConfig {

    public Blog blog = null;
    public App app = null;
    public Notification notification = null;
    public Ads ads = null;
    public List<Category> labels = new ArrayList<>();

}
