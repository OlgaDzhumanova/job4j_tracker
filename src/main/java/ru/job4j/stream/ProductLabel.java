package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        List<Label> labels = products.stream()
                .filter(product -> product.getStandard() - product.getActual() >= 0)
                .filter(product -> product.getStandard() - product.getActual() <= 3)
                .map(product -> new Label(product.getName(), (float) (product.getPrice() * 0.5)))
                .collect(Collectors.toList());

        return labels.stream()
                .map(label -> label.toString())
                .collect(Collectors.toList());
    }
}
