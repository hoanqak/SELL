package com.sell.phone.controller;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Category;
import com.sell.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.service.CategoryService;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryImpl categoryImpl;

    @Autowired
    ProductImpl productImpl;

    @RequestMapping("/htc")
    public String htc(Model model) {
        categoryService.htc(model);
        return "view/Category";
    }

    @RequestMapping("/iphone")
    public String iphone(Model model) {
        categoryService.iphone(model);

        return "view/Category";
    }

    @RequestMapping("/samsung")
    public String samsung(Model model) {
        categoryService.samsung(model);

        return "view/Category";
    }

    @RequestMapping("/nokia")
    public String nokia(Model model) {
        categoryService.nokia(model);

        return "view/Category";
    }

    @RequestMapping("/blackberry")
    public String blackberry(Model model) {
        categoryService.blackberry(model);

        return "view/Category";
    }

    @RequestMapping("/sony")
    public String sony(Model model) {
        categoryService.sony(model);
        return "view/Category";
    }

    @RequestMapping("/{category}/{code}-{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productImpl.getProduct(id));
        return "view/show-info";
    }

    @RequestMapping("/{category}/iphone")
    public String redirectIphone() {
        System.out.println("Here");
        return "redirect:/iphone";
    }

    @RequestMapping("/{category}/htc")
    public String redirectHtc() {
        System.out.println("Here");
        return "redirect:/htc";
    }

    @RequestMapping("/{category}/blackberry")
    public String redirectBlack() {
        System.out.println("Here");
        return "redirect:/blackberry";
    }

    @RequestMapping("/{category}/sony")
    public String redirectSony() {
        System.out.println("Here");
        return "redirect:/sony";
    }

    @RequestMapping("/{category}/nokia")
    public String redirectNokia() {
        System.out.println("Here");
        return "redirect:/nokia";
    }
}
