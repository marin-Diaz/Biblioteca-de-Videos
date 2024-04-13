package culturemedia.services;

import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;

public interface CultureMediaService {
    List<Video> findAllVideos();

    Video addVideo(Video video);

    View addView(View view);
}