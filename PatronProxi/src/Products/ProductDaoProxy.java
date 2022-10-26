package Products;

public class ProductDaoProxy implements ProductDao{

    private final ProductDao productDao;

    public ProductDaoProxy(ProductDao productDao) {
        this.productDao = productDao;
    }
    public Product findById(Long id) {
        System.out.println("Lógica de proxy antes de encontrar");
        Product p = this.productDao.findById(id);
        System.out.println("Logica proxy despues de encontrar");
        return p;
    }
    public Product save(Product product) {
        System.out.println("Logica del proxy antes de guardar");
        Product p = this.productDao.save(product);
        System.out.println("Logica del proxy despues de guardar");
        return p;
    }

}
