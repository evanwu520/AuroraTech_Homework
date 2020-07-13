package com.evan.homework.facotry.work;

import com.evan.homework.model.Box;
import com.evan.homework.model.Product;
import com.evan.homework.model.Shoes;
import com.evan.homework.repository.BoxRepository;
import com.evan.homework.repository.ProductRepository;
import com.evan.homework.repository.ShoesRepository;
import com.evan.homework.util.GenerateSeq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
public class CombineWork implements Work {


    @Autowired
    BoxRepository boxRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShoesRepository shoesRepository;

    @Override
    @Transactional
    public void produce() {

        Optional<Box> boxOptional = boxRepository.findUnCombineBox();
        Optional<Shoes> shoesOptional = shoesRepository.findUnCombineShoes();

        if (boxOptional.isPresent() && shoesOptional.isPresent()){

            Box box = boxOptional.get();
            box.setStatus(1);
            boxRepository.save(box);

            Shoes shoes = shoesOptional.get();
            shoes.setStatus(1);
            shoesRepository.save(shoes);


            Product product = new Product();
            product.setBoxId(box.getId());
            product.setShoesId(shoes.getId());

            String id = GenerateSeq.genCombineSeq(product.getBoxId(), product.getShoesId());
            product.setId(id);
            productRepository.save(product);
        }
    }
}
