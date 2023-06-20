package com.store.store.controllers.tests;

import com.store.store.constants.ProductURLConstant;
import com.store.store.controllers.BaseController;
import com.store.store.entities.tests.ManyToOneEntity;
import com.store.store.entities.tests.OneToManyEntity;
import com.store.store.entities.tests.RootEntity;
import com.store.store.services.tests.ManyToOneService;
import com.store.store.services.tests.OneToManyService;
import com.store.store.services.tests.RootService;
import com.store.store.utils.specification.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("root")
public class RootController  {
    //extends BaseController<RootEntity,RootService>
    /*@Autowired
    private RootService rootService;

    @Autowired
    private ManyToOneService manyToOneService;

    @Autowired
    private OneToManyService oneToManyService;

    private int fill = 0;

    @GetMapping("/root")
    public ResponseEntity<?> getAll(@RequestParam(required = false) String query, Pageable pageable){
        try {
            if(fill==0) {
                fill();
            }
            org.springframework.data.jpa.domain.Specification<RootEntity> specification = new Specification<RootEntity>(query);
            return ResponseEntity.status(HttpStatus.OK).body(rootService.getAll(specification, pageable));
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("\"error\":" + e.getMessage());
        }
    }

    private void fill() throws Exception{
        this.fill = 1;
        ManyToOneEntity manyToOne1 = new ManyToOneEntity("manyToOne1",1,1.1F);
        ManyToOneEntity manyToOne2 = new ManyToOneEntity("manyToOne2",2,2.1F);
        ManyToOneEntity manyToOne3 = new ManyToOneEntity("manyToOne3",3,3.1F);
        ManyToOneEntity manyToOne4 = new ManyToOneEntity("manyToOne4",4,4.1F);
        ManyToOneEntity manyToOne5 = new ManyToOneEntity("manyToOne5",5,5.1F);
        ManyToOneEntity manyToOne6 = new ManyToOneEntity("manyToOne6",6,6.1F);
        ManyToOneEntity manyToOne7 = new ManyToOneEntity("manyToOne7",7,7.1F);
        ManyToOneEntity manyToOne8 = new ManyToOneEntity("manyToOne8",8,8.1F);
        ManyToOneEntity manyToOne9 = new ManyToOneEntity("manyToOne9",9,9.1F);
        ManyToOneEntity manyToOne10 = new ManyToOneEntity("manyToOne10",10,10.1F);

        ManyToOneEntity manyToOne11 = new ManyToOneEntity("manyToOne6",7,11.1F);
        ManyToOneEntity manyToOne12 = new ManyToOneEntity("manyToOne8",9,12.1F);
        ManyToOneEntity manyToOne13 = new ManyToOneEntity("manyToOne3",4,13.1F);
        ManyToOneEntity manyToOne14 = new ManyToOneEntity("manyToOne1",2,14.1F);
        ManyToOneEntity manyToOne15 = new ManyToOneEntity("manyToOne2",3,15.1F);
        ManyToOneEntity manyToOne16 = new ManyToOneEntity("manyToOne10",11,16.1F);
        ManyToOneEntity manyToOne17 = new ManyToOneEntity("manyToOne9",10,17.1F);
        ManyToOneEntity manyToOne18 = new ManyToOneEntity("manyToOne7",8,18.1F);
        ManyToOneEntity manyToOne19 = new ManyToOneEntity("manyToOne5",6,19.1F);
        ManyToOneEntity manyToOne20 = new ManyToOneEntity("manyToOne4",5,20.1F);

        ManyToOneEntity manyToOne21 = new ManyToOneEntity("manyToOne6",5,21.1F);
        ManyToOneEntity manyToOne22 = new ManyToOneEntity("manyToOne8",7,22.1F);
        ManyToOneEntity manyToOne23 = new ManyToOneEntity("manyToOne3",2,23.1F);
        ManyToOneEntity manyToOne24 = new ManyToOneEntity("manyToOne1",0,24.1F);
        ManyToOneEntity manyToOne25 = new ManyToOneEntity("manyToOne2",1,25.1F);
        ManyToOneEntity manyToOne26 = new ManyToOneEntity("manyToOne10",9,26.1F);
        ManyToOneEntity manyToOne27 = new ManyToOneEntity("manyToOne9",8,27.1F);
        ManyToOneEntity manyToOne28 = new ManyToOneEntity("manyToOne7",6,28.1F);
        ManyToOneEntity manyToOne29 = new ManyToOneEntity("manyToOne5",4,29.1F);
        ManyToOneEntity manyToOne30 = new ManyToOneEntity("manyToOne4",3,30.1F);
        manyToOneService.create(manyToOne6);
        manyToOneService.create(manyToOne2);
        manyToOneService.create(manyToOne8);
        manyToOneService.create(manyToOne10);
        manyToOneService.create(manyToOne3);
        manyToOneService.create(manyToOne4);
        manyToOneService.create(manyToOne7);
        manyToOneService.create(manyToOne1);
        manyToOneService.create(manyToOne5);
        manyToOneService.create(manyToOne9);

        manyToOneService.create(manyToOne16);
        manyToOneService.create(manyToOne12);
        manyToOneService.create(manyToOne18);
        manyToOneService.create(manyToOne20);
        manyToOneService.create(manyToOne13);
        manyToOneService.create(manyToOne14);
        manyToOneService.create(manyToOne17);
        manyToOneService.create(manyToOne11);
        manyToOneService.create(manyToOne15);
        manyToOneService.create(manyToOne19);

        manyToOneService.create(manyToOne26);
        manyToOneService.create(manyToOne22);
        manyToOneService.create(manyToOne28);
        manyToOneService.create(manyToOne30);
        manyToOneService.create(manyToOne23);
        manyToOneService.create(manyToOne24);
        manyToOneService.create(manyToOne27);
        manyToOneService.create(manyToOne21);
        manyToOneService.create(manyToOne25);
        manyToOneService.create(manyToOne29);


        OneToManyEntity oneToMany1 = new OneToManyEntity("oneToMany1",1,1.1F);
        OneToManyEntity oneToMany2 = new OneToManyEntity("oneToMany2",2,2.1F);
        OneToManyEntity oneToMany3 = new OneToManyEntity("oneToMany3",3,3.1F);
        OneToManyEntity oneToMany4 = new OneToManyEntity("oneToMany4",4,4.1F);
        OneToManyEntity oneToMany5 = new OneToManyEntity("oneToMany5",5,5.1F);
        OneToManyEntity oneToMany6 = new OneToManyEntity("oneToMany6",6,6.1F);
        OneToManyEntity oneToMany7 = new OneToManyEntity("oneToMany7",7,7.1F);
        OneToManyEntity oneToMany8 = new OneToManyEntity("oneToMany8",8,8.1F);
        OneToManyEntity oneToMany9 = new OneToManyEntity("oneToMany9",9,9.1F);
        OneToManyEntity oneToMany10 = new OneToManyEntity("oneToMany10",10,10.1F);

        OneToManyEntity oneToMany11 = new OneToManyEntity("oneToMany6",7,11.1F);
        OneToManyEntity oneToMany12 = new OneToManyEntity("oneToMany8",9,12.1F);
        OneToManyEntity oneToMany13 = new OneToManyEntity("oneToMany3",4,13.1F);
        OneToManyEntity oneToMany14 = new OneToManyEntity("oneToMany1",2,14.1F);
        OneToManyEntity oneToMany15 = new OneToManyEntity("oneToMany2",3,15.1F);
        OneToManyEntity oneToMany16 = new OneToManyEntity("oneToMany10",11,16.1F);
        OneToManyEntity oneToMany17 = new OneToManyEntity("oneToMany9",10,17.1F);
        OneToManyEntity oneToMany18 = new OneToManyEntity("oneToMany7",8,18.1F);
        OneToManyEntity oneToMany19 = new OneToManyEntity("oneToMany5",6,19.1F);
        OneToManyEntity oneToMany20 = new OneToManyEntity("oneToMany4",5,20.1F);

        OneToManyEntity oneToMany21 = new OneToManyEntity("oneToMany6",5,21.1F);
        OneToManyEntity oneToMany22 = new OneToManyEntity("oneToMany8",7,22.1F);
        OneToManyEntity oneToMany23 = new OneToManyEntity("oneToMany3",2,23.1F);
        OneToManyEntity oneToMany24 = new OneToManyEntity("oneToMany1",0,24.1F);
        OneToManyEntity oneToMany25 = new OneToManyEntity("oneToMany2",1,25.1F);
        OneToManyEntity oneToMany26 = new OneToManyEntity("oneToMany10",9,26.1F);
        OneToManyEntity oneToMany27 = new OneToManyEntity("oneToMany9",8,27.1F);
        OneToManyEntity oneToMany28 = new OneToManyEntity("oneToMany7",6,28.1F);
        OneToManyEntity oneToMany29 = new OneToManyEntity("oneToMany5",4,29.1F);
        OneToManyEntity oneToMany30 = new OneToManyEntity("oneToMany4",3,30.1F);
        oneToManyService.create(oneToMany6);
        oneToManyService.create(oneToMany2);
        oneToManyService.create(oneToMany8);
        oneToManyService.create(oneToMany10);
        oneToManyService.create(oneToMany3);
        oneToManyService.create(oneToMany4);
        oneToManyService.create(oneToMany7);
        oneToManyService.create(oneToMany1);
        oneToManyService.create(oneToMany5);
        oneToManyService.create(oneToMany9);

        oneToManyService.create(oneToMany16);
        oneToManyService.create(oneToMany12);
        oneToManyService.create(oneToMany18);
        oneToManyService.create(oneToMany20);
        oneToManyService.create(oneToMany13);
        oneToManyService.create(oneToMany14);
        oneToManyService.create(oneToMany17);
        oneToManyService.create(oneToMany11);
        oneToManyService.create(oneToMany15);
        oneToManyService.create(oneToMany19);

        oneToManyService.create(oneToMany26);
        oneToManyService.create(oneToMany22);
        oneToManyService.create(oneToMany28);
        oneToManyService.create(oneToMany30);
        oneToManyService.create(oneToMany23);
        oneToManyService.create(oneToMany24);
        oneToManyService.create(oneToMany27);
        oneToManyService.create(oneToMany21);
        oneToManyService.create(oneToMany25);
        oneToManyService.create(oneToMany29);

        List<OneToManyEntity> listOneToMany1 = new ArrayList<OneToManyEntity>();
        listOneToMany1.add(oneToMany1);
        listOneToMany1.add(oneToMany2);
        listOneToMany1.add(oneToMany3);
        List<OneToManyEntity> listOneToMany2 = new ArrayList<OneToManyEntity>();
        listOneToMany2.add(oneToMany4);
        listOneToMany2.add(oneToMany5);
        listOneToMany2.add(oneToMany6);
        List<OneToManyEntity> listOneToMany3 = new ArrayList<OneToManyEntity>();
        listOneToMany3.add(oneToMany7);
        listOneToMany3.add(oneToMany8);
        listOneToMany3.add(oneToMany9);
        List<OneToManyEntity> listOneToMany4 = new ArrayList<OneToManyEntity>();
        listOneToMany4.add(oneToMany10);
        listOneToMany4.add(oneToMany11);
        listOneToMany4.add(oneToMany12);
        List<OneToManyEntity> listOneToMany5 = new ArrayList<OneToManyEntity>();
        listOneToMany5.add(oneToMany13);
        listOneToMany5.add(oneToMany14);
        listOneToMany5.add(oneToMany15);
        List<OneToManyEntity> listOneToMany6 = new ArrayList<OneToManyEntity>();
        listOneToMany6.add(oneToMany16);
        listOneToMany6.add(oneToMany17);
        listOneToMany6.add(oneToMany18);
        List<OneToManyEntity> listOneToMany7 = new ArrayList<OneToManyEntity>();
        listOneToMany7.add(oneToMany19);
        listOneToMany7.add(oneToMany20);
        listOneToMany7.add(oneToMany21);
        List<OneToManyEntity> listOneToMany8 = new ArrayList<OneToManyEntity>();
        listOneToMany8.add(oneToMany22);
        listOneToMany8.add(oneToMany23);
        listOneToMany8.add(oneToMany24);
        List<OneToManyEntity> listOneToMany9 = new ArrayList<OneToManyEntity>();
        listOneToMany9.add(oneToMany25);
        listOneToMany9.add(oneToMany26);
        listOneToMany9.add(oneToMany27);
        List<OneToManyEntity> listOneToMany10 = new ArrayList<OneToManyEntity>();
        listOneToMany10.add(oneToMany28);
        listOneToMany10.add(oneToMany29);
        listOneToMany10.add(oneToMany30);


        List<OneToManyEntity> listOneToMany11 = new ArrayList<OneToManyEntity>();
        listOneToMany11.add(oneToMany2);
        listOneToMany11.add(oneToMany3);
        listOneToMany11.add(oneToMany4);
        List<OneToManyEntity> listOneToMany12 = new ArrayList<OneToManyEntity>();
        listOneToMany12.add(oneToMany5);
        listOneToMany12.add(oneToMany6);
        listOneToMany12.add(oneToMany7);
        List<OneToManyEntity> listOneToMany13 = new ArrayList<OneToManyEntity>();
        listOneToMany13.add(oneToMany8);
        listOneToMany13.add(oneToMany9);
        listOneToMany13.add(oneToMany10);
        List<OneToManyEntity> listOneToMany14 = new ArrayList<OneToManyEntity>();
        listOneToMany14.add(oneToMany11);
        listOneToMany14.add(oneToMany12);
        listOneToMany14.add(oneToMany13);
        List<OneToManyEntity> listOneToMany15 = new ArrayList<OneToManyEntity>();
        listOneToMany15.add(oneToMany14);
        listOneToMany15.add(oneToMany15);
        listOneToMany15.add(oneToMany16);
        List<OneToManyEntity> listOneToMany16 = new ArrayList<OneToManyEntity>();
        listOneToMany16.add(oneToMany17);
        listOneToMany16.add(oneToMany18);
        listOneToMany16.add(oneToMany19);
        List<OneToManyEntity> listOneToMany17 = new ArrayList<OneToManyEntity>();
        listOneToMany17.add(oneToMany20);
        listOneToMany17.add(oneToMany21);
        listOneToMany17.add(oneToMany22);
        List<OneToManyEntity> listOneToMany18 = new ArrayList<OneToManyEntity>();
        listOneToMany18.add(oneToMany23);
        listOneToMany18.add(oneToMany24);
        listOneToMany18.add(oneToMany25);
        List<OneToManyEntity> listOneToMany19 = new ArrayList<OneToManyEntity>();
        listOneToMany19.add(oneToMany26);
        listOneToMany19.add(oneToMany27);
        listOneToMany19.add(oneToMany28);
        List<OneToManyEntity> listOneToMany20 = new ArrayList<OneToManyEntity>();
        listOneToMany20.add(oneToMany29);
        listOneToMany20.add(oneToMany30);
        listOneToMany20.add(oneToMany1);

        List<OneToManyEntity> listOneToMany21 = new ArrayList<OneToManyEntity>();
        listOneToMany21.add(oneToMany30);
        listOneToMany21.add(oneToMany1);
        listOneToMany21.add(oneToMany2);
        List<OneToManyEntity> listOneToMany22 = new ArrayList<OneToManyEntity>();
        listOneToMany22.add(oneToMany3);
        listOneToMany22.add(oneToMany4);
        listOneToMany22.add(oneToMany5);
        List<OneToManyEntity> listOneToMany23 = new ArrayList<OneToManyEntity>();
        listOneToMany23.add(oneToMany6);
        listOneToMany23.add(oneToMany7);
        listOneToMany23.add(oneToMany8);
        List<OneToManyEntity> listOneToMany24 = new ArrayList<OneToManyEntity>();
        listOneToMany24.add(oneToMany9);
        listOneToMany24.add(oneToMany10);
        listOneToMany24.add(oneToMany11);
        List<OneToManyEntity> listOneToMany25 = new ArrayList<OneToManyEntity>();
        listOneToMany25.add(oneToMany12);
        listOneToMany25.add(oneToMany13);
        listOneToMany25.add(oneToMany14);
        List<OneToManyEntity> listOneToMany26 = new ArrayList<OneToManyEntity>();
        listOneToMany26.add(oneToMany15);
        listOneToMany26.add(oneToMany16);
        listOneToMany26.add(oneToMany17);
        List<OneToManyEntity> listOneToMany27 = new ArrayList<OneToManyEntity>();
        listOneToMany27.add(oneToMany18);
        listOneToMany27.add(oneToMany19);
        listOneToMany27.add(oneToMany20);
        List<OneToManyEntity> listOneToMany28 = new ArrayList<OneToManyEntity>();
        listOneToMany28.add(oneToMany21);
        listOneToMany28.add(oneToMany22);
        listOneToMany28.add(oneToMany23);
        List<OneToManyEntity> listOneToMany29 = new ArrayList<OneToManyEntity>();
        listOneToMany29.add(oneToMany24);
        listOneToMany29.add(oneToMany25);
        listOneToMany29.add(oneToMany26);
        List<OneToManyEntity> listOneToMany30 = new ArrayList<OneToManyEntity>();
        listOneToMany30.add(oneToMany27);
        listOneToMany30.add(oneToMany28);
        listOneToMany30.add(oneToMany29);

        RootEntity root1 = new RootEntity("root1",1,1.1F,manyToOne1,listOneToMany1);
        RootEntity root2 = new RootEntity("root2",2,2.1F,manyToOne2,listOneToMany2);
        RootEntity root3 = new RootEntity("root3",3,3.1F,manyToOne3,listOneToMany3);
        RootEntity root4 = new RootEntity("root4",4,4.1F,manyToOne4,listOneToMany4);
        RootEntity root5 = new RootEntity("root5",5,5.1F,manyToOne5,listOneToMany5);
        RootEntity root6 = new RootEntity("root6",6,6.1F,manyToOne6,listOneToMany6);
        RootEntity root7 = new RootEntity("root7",7,7.1F,manyToOne7,listOneToMany7);
        RootEntity root8 = new RootEntity("root8",8,8.1F,manyToOne8,listOneToMany8);
        RootEntity root9 = new RootEntity("root9",9,9.1F,manyToOne9,listOneToMany9);
        RootEntity root10 = new RootEntity("root10",10,10.1F,manyToOne10,listOneToMany10);

        RootEntity root11 = new RootEntity("root6",7,11.1F,manyToOne11,listOneToMany11);
        RootEntity root12 = new RootEntity("root8",9,12.1F,manyToOne12,listOneToMany12);
        RootEntity root13 = new RootEntity("root3",4,13.1F,manyToOne13,listOneToMany13);
        RootEntity root14 = new RootEntity("root1",2,14.1F,manyToOne14,listOneToMany14);
        RootEntity root15 = new RootEntity("root2",3,15.1F,manyToOne15,listOneToMany15);
        RootEntity root16 = new RootEntity("root10",11,16.1F,manyToOne16,listOneToMany16);
        RootEntity root17 = new RootEntity("root9",10,17.1F,manyToOne17,listOneToMany17);
        RootEntity root18 = new RootEntity("root7",8,18.1F,manyToOne18,listOneToMany18);
        RootEntity root19 = new RootEntity("root5",6,19.1F,manyToOne19,listOneToMany19);
        RootEntity root20 = new RootEntity("root4",5,20.1F,manyToOne20,listOneToMany20);

        RootEntity root21 = new RootEntity("root6",5,21.1F,manyToOne21,listOneToMany21);
        RootEntity root22 = new RootEntity("root8",7,22.1F,manyToOne22,listOneToMany22);
        RootEntity root23 = new RootEntity("root3",2,23.1F,manyToOne23,listOneToMany23);
        RootEntity root24 = new RootEntity("root1",0,24.1F,manyToOne24,listOneToMany24);
        RootEntity root25 = new RootEntity("root2",1,25.1F,manyToOne25,listOneToMany25);
        RootEntity root26 = new RootEntity("root10",9,26.1F,manyToOne26,listOneToMany26);
        RootEntity root27 = new RootEntity("root9",8,27.1F,manyToOne27,listOneToMany27);
        RootEntity root28 = new RootEntity("root7",6,28.1F,manyToOne28,listOneToMany28);
        RootEntity root29 = new RootEntity("root5",4,29.1F,manyToOne29,listOneToMany29);
        RootEntity root30 = new RootEntity("root4",3,30.1F,manyToOne30,listOneToMany30);
        rootService.create(root6);
        rootService.create(root2);
        rootService.create(root8);
        rootService.create(root10);
        rootService.create(root3);
        rootService.create(root4);
        rootService.create(root7);
        rootService.create(root1);
        rootService.create(root5);
        rootService.create(root9);

        rootService.create(root16);
        rootService.create(root12);
        rootService.create(root18);
        rootService.create(root20);
        rootService.create(root13);
        rootService.create(root14);
        rootService.create(root17);
        rootService.create(root11);
        rootService.create(root15);
        rootService.create(root19);

        rootService.create(root26);
        rootService.create(root22);
        rootService.create(root28);
        rootService.create(root30);
        rootService.create(root23);
        rootService.create(root24);
        rootService.create(root27);
        rootService.create(root21);
        rootService.create(root25);
        rootService.create(root29);
    }*/
}
