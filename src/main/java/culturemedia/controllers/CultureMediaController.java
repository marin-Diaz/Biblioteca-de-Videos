package culturemedia.controllers;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.services.CultureMediaService;


import java.util.List;

public class CultureMediaController {
    private final CultureMediaService cultureMediaService;


    public CultureMediaController(CultureMediaService cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> findAll() throws VideoNotFoundException {
        List<Video> videos;
        videos = cultureMediaService.findAll();
        return videos;
    }
}
