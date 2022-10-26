package Products;

public class ProductDaoImpl implements ProductDao{

    public Product findById(Long id) {
        System.out.println("Encontramos el producto con id = " + id);
        return new Product(id, "monitor");
    }

    public Product save(Product product) {
        System.out.println("Guardamos producto" );
        return product;
    }

}
