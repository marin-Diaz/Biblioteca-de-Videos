package culturemedia.services.imp;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.services.CultureMediaService;

import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;


    @Override
    public List<Video> findAllVideos() {
        return null;
    }

    @Override
    public Video addVideo(Video video) {
        return null;
    }

    @Override
    public View addView(View view) {
        return null;
    }
}
