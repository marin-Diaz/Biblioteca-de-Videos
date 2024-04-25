package culturemedia.services;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.ViewsRepository;

import java.util.List;

public interface CultureMediaService {

    Video save (Video video);

    ViewsRepository save  (View view);
    List<Video>findAll()throws  VideoNotFoundException;
    List<Video> find(String title) throws VideoNotFoundException;
    List<Video> find(double fromDuration, double toDuration) throws VideoNotFoundException;

}