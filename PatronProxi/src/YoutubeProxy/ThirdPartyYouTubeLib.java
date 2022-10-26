package YoutubeProxy;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);


    /*En este ejemplo, el patrón Proxy ayuda a implementar la inicialización diferida y
    el almacenamiento en caché a una ineficiente biblioteca de integración de YouTube
    de un tercero.*/
}
