import VentasProxyDinamico.DynamicProxy;
import VentasProxyDinamico.ISell;
import VentasProxyDinamico.Shoes;
import VentasProxyEstatico.Mianmo;
import VentasProxyEstatico.Xiaoli;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    /*
    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
    */
    public static void main(String[] args) {
        System.out.println("Martin Paliza Sanchez - Patron Proxy");
        /*
        ProductDao productDao = new ProductDaoImpl();
        System.out.println(" 1) Sin muestra proxy ");
        Product p1 = productDao.findById(10L);
        productDao.save(p1);

        System.out.println(" 2) Con muestra proxy ");
        ProductDaoProxy productDaoProxy = new ProductDaoProxy(productDao);
        Product p2 = productDaoProxy.findById(10L);
        productDaoProxy.save(p2);
        */
        /*
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Tiempo ahorrado por el proxy de almacenamiento en el cache: " + (naive - smart) + " ms");
        */
        /*
        Mianmo mianmo = new Mianmo();
        Xiaoli xiaoli = new Xiaoli(mianmo);
        xiaoli.sell();
        */

        Mianmo mianmo = new Mianmo();
        InvocationHandler handler = new DynamicProxy(mianmo);
        ISell iSell = (ISell) Proxy.newProxyInstance(Mianmo.class.getClassLoader(), Mianmo.class.getInterfaces(), handler);
        iSell.sell();


        Shoes shoes = new Shoes();
        InvocationHandler handler1 = new DynamicProxy(shoes);
        ISell iSell1 = (ISell) Proxy.newProxyInstance(Shoes.class.getClassLoader(), Shoes.class.getInterfaces(), handler);
        iSell1.sell();
    }

}