package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Picks_Qty {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_picks")
    @SequenceGenerator(name = "seq_picks", allocationSize = 5)
    @Column(name = "Pick_No", length = 45)
    private long pick_id;

    @EmbeddedId
    qty_compositeKey id;

    @ManyToOne
    @MapsId("studentId") //  maps the studentId attribute of embedded id
    @JoinColumn(name = "student_id")
    Customer customer;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    Goods goods;

    int ex_qty ;

}
