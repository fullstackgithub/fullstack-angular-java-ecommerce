package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springecommerce.shop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
