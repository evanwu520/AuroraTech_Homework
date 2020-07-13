package com.evan.homework.controller;

import com.evan.homework.model.Box;
import com.evan.homework.model.Product;
import com.evan.homework.model.Shoes;
import com.evan.homework.model.Unproduced;
import com.evan.homework.service.BoxService;
import com.evan.homework.service.ProductService;
import com.evan.homework.service.ShoesService;
import com.sun.deploy.security.BadCertificateDialog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("report")
public class MainController {

    @Autowired
    BoxService boxService;

    @Autowired
    ShoesService shoesService;

    @Autowired
    ProductService productService;


    @ApiOperation(value = "鞋盒編號報表", notes = "鞋盒編號報表")
    @GetMapping("/box")
    public ResponseEntity<List<Box>>  getBoxData(){
        return ResponseEntity.ok(boxService.getBoxList());
    }



    @ApiOperation(value = "鞋子編號報表", notes = "鞋子編號報表")
    @GetMapping("/shoes")
    public ResponseEntity<List<Shoes>>  getShoesData(){
        return ResponseEntity.ok(shoesService.getShoesList());
    }


    @ApiOperation(value = "組裝成品報表", notes = "組裝成品報表")
    @GetMapping("/product")
    public ResponseEntity<List<Product>>  getProductData(){
        return ResponseEntity.ok(productService.getProductList());
    }


    @ApiOperation(value = "過剩報表", notes = "過剩報表")
    @GetMapping("/unproduced")
    public ResponseEntity<List<Unproduced>>  getUnProducedData(){

        List<Unproduced> list = new ArrayList<>();


        List<Shoes> shoesList =  shoesService.getShoesList();
        List<Box> boxList  =  boxService.getBoxList();

        boxList.stream().filter(p -> p.getStatus() == 0 ).collect(Collectors.toList());
        shoesList.stream().filter(p -> p.getStatus() == 0 ).collect(Collectors.toList());

        shoesList.stream().map(s -> new Unproduced("shoes", s.getId())).forEach(list::add);
        boxList.stream().map(s -> new Unproduced("box", s.getId())).forEach(list::add);

        return ResponseEntity.ok(list);
    }


}
