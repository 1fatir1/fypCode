package com.api.cpms.controllers;

import com.api.cpms.dao.ProductRepository;
import com.api.cpms.dao.ProductTypeRepository;
import com.api.cpms.dao.TagsRepository;
import com.api.cpms.entities.Attribute;
import com.api.cpms.entities.AttributeTerm;
import com.api.cpms.entities.Category;
import com.api.cpms.entities.Product;
import com.api.cpms.entities.SubCategory;
import com.api.cpms.entities.Tags;
import com.api.cpms.entities.productType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;

    private Product product=new Product();
    private Product p1 = new Product();
    private Product p2 = new Product();
    private Product p3 = new Product();
    private Tags tags=new Tags();
    private Tags tag=new Tags();
    private Category c1=new Category();
    private Category c2=new Category();
    private SubCategory s1=new SubCategory();
    private SubCategory s2=new SubCategory();
    private SubCategory s3=new SubCategory();
    private Attribute a1 = new Attribute();
    private Attribute a2 = new Attribute();
    private AttributeTerm at1 = new AttributeTerm();
    private AttributeTerm at2 = new AttributeTerm();
    private AttributeTerm at3 = new AttributeTerm();
    
    private productType b1 = new productType();
    private productType b2 = new productType();
    private productType g1 = new productType();
    private productType g2 = new productType();
    
    @GetMapping("/")
    public String welcome(){
        product.setProductName("Bike");
        product.setProductDescription("CD 125");
        product.setDate(new Date());
        product.setProductPrice(90000);
        product.setSku("SKU");
        tags.setTagName("motor");
        tag.setTagName("xyz");
        c1.setName("c1");
        c2.setName("c2");
        s1.setName("sc1");
        s2.setName("sc2");
        s3.setName("sc3");
        List<Tags> list=List.of(tags,tag);
        List<Category> list1=List.of(c1,c2);
        List<SubCategory> lis2=List.of(s1,s2,s3);
        List<SubCategory> list3=List.of(s1,s3);
        c1.setSubCategory(lis2);
        
        at1.setName("black");
        at2.setName("blue");
        at3.setName("7foot");
        List<AttributeTerm> atList1 = List.of(at1,at2);
        List<AttributeTerm> atList2 = List.of(at3);
        
        a1.setName("colour");
        a2.setName("size");
        a1.setAtList(atList1);
        a2.setAtList(atList2);
        List<Attribute> aList=List.of(a1,a2);
        
        product.setTags(list);
        product.setCategory(list1);
        product.setSubCategory(list3);
        product.setAttribute(aList);
        product= productRepository.save(product);

       p1.setProductName("p1");
       p2.setProductName("p2");
       p3.setProductName("p3");
       List<Product> b1 = List.of(p1,p2);
       List<Product> b2 = List.of(p1,p2,p3);
       List<Product> g1 = List.of(p1,p2,product);
       List<Product> g2 = List.of(p1,p2,product,p3);
       productRepository.save(p1);
       productRepository.save(p2);
       productRepository.save(p3);
       
       this.b1.setName("b1");
       this.b1.setType("Bundle");
       this.b1.setProducts(b1);
       
       this.b2.setName("b2");
       this.b2.setType("Bundle");
       this.b2.setProducts(b2);
       
       this.g1.setName("g1");
       this.g1.setType("Group");
       this.g1.setProducts(g1);
       
       this.g2.setName("g2");
       this.g2.setType("Group");
       this.g2.setProducts(g2);
       
       productTypeRepository.save(this.b1);
       productTypeRepository.save(this.b2);
       productTypeRepository.save(this.g1);
       productTypeRepository.save(this.g2);
       
        System.out.println(product.toString());

        return "Welcome";
    }
}

