package com.springboot.database.data.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "babylion_detail")
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class BabyLionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne(optional = false)
    @JoinColumn(name = "babylion_id")
    private BabyLion babyLion;
}
