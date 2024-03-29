package com.aung.ElasticSearch.repo;


import com.aung.ElasticSearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {

}
