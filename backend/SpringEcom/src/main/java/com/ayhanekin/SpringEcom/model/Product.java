package com.ayhanekin.SpringEcom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal price;
    private Date releaseDate;
    private Integer stockQuantity;
    private String name;
    private String description;
    private String brand;
    private String category;
    private boolean productAvailable;
    // Image
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;




}
