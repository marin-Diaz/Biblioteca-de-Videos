package culturemedia.controllers;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.services.imp.CultureMediaServiceImpl;

import java.util.List;

public class CultureMediaController {
    private final CultureMediaServiceImpl cultureMediaService;


    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> find_allVideos() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }
}
